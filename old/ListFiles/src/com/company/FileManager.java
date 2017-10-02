package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler.BUFFER_SIZE;

/**
 * Created by amour on 01.04.2017.
 */
public class FileManager {
    private File[]list;
    private final String home = System.getProperty("user.home");
    private final File homePath = new File(home);
    private File F = new File(home);

    public String getPath() {
        return F.getPath();
    }

    public void commandPwd(){
        System.out.println(F.getPath());
    } //команда где он сейчас находится
    public void commandLs(){
         // команда выводит все файлы
        list = F.listFiles();
        for (int i = 0; i < list.length; i++) {
            if (!list[i].isHidden()) {
                System.out.println(list[i].getName());
            }
        }
    }
    public void commandLs_a(){
        list = F.listFiles();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    } //выводит все скрытые и все остальные файлы
    public void commandLs_l(){
        list = F.listFiles();
        for (int i = 0; i < list.length; i++) {
            if (!list[i].isHidden()){
                soutFileInfo(list[i]);
            }
        }
    } //выводит инфу про файлы
    public void commandLs_la(){
        list = F.listFiles();
        for (int i = 0; i < list.length; i++) {
            soutFileInfo(list[i]);
        }
    } //выводит инфу про файлы вместе со скрытыми
    public void soutFileInfo(File q){
        String drwx ="";

        if(q.isDirectory()){
            drwx += "d";
        }
        else if(q.isFile()){
            drwx += "-";
        }
        if(q.canRead()){
            drwx += "r";
        }
        if (q.canWrite()){
            drwx += "w";
        }
        if(q.canExecute()) {
            drwx += "x";
        }

        double size = q.length();
        String sizestr = "" + (int)size + " Byte";
        if(size / 1024 >= 1){
            size /= 1024;
            sizestr = "" + (int)size + " KB";
        }
        if(size / 1024 >= 1){
            size /= 1024;
            sizestr = "" + (int)size + " MB";
        }
        if(size / 1024 >= 1){
            size /= 1024;
            sizestr = "" + (int)size + " GB";
        }

        System.out.print(drwx + " " + sizestr + " ");
        System.out.println(q.getName());
    } //информация про файл (берет от сюда)

    public void cdToHome(){
        F = new File(home);
    } //переходит к домашней директории
    public void cdToLink(String link){
        String path = F.getPath();
        String pathTo = "";
        if(link.isEmpty() || link.equals("~")){
            cdToHome();
        }
        else {
            if(link.charAt(0) == '/'){
                path = "";
                for (int i = 1; i < link.length(); i++){
                    pathTo += link.charAt(i);
                }
            }
            else{
                for (int i = 0; i < link.length(); i++){
                    pathTo += link.charAt(i);
                }
            }
            int i = 0;
            int k = 0;
            while (pathTo.length() - i >= 2 && pathTo.charAt(i) == '.' && pathTo.charAt(i + 1) == '.' && (i + 2 >= pathTo.length() || pathTo.charAt(i + 2) == '/' )){
                k++;
                i += 3;
            }
            link = "";
            for (;i < pathTo.length(); i++){
                link += pathTo.charAt(i);
            }

            File q = new File(path);
            for (i = 0; i < k; i++){
                q = new File(q.getParent());
            }

            path = q.getPath() + "/" + link;
            q = new File(path);
            if (q.isDirectory()){
                F = new File(path);
            }
            else {
                System.out.println("Такой директории нет");
            }
        }
    } //переходит по папкам

    public void remDir(File file){
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                remDir(f);
            }
        }
        file.delete();
        System.out.println("Удаленный файл или папка: " + file.getAbsolutePath());
    } //удаляет папку с содержимым рекурсивным методом
    public void remFiles(String s){
        if(s.length() == 1 && s.charAt(0) == '*'){
            File file = new File(F.getPath());
            remFilesToDir(file);
        }
        else{
            String q = "";
            for (int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    if(q.charAt(0) == '*' && q.charAt(1) == '.'){
                        String exp = "";
                        for (int j = 1; j < q.length(); j++){
                            exp += q.charAt(j);
                        }
                        remFilesWithExp(exp);
                    }
                    else{
                        remFileWithName(q);
                    }
                    q = "";
                }
                else {
                    q += s.charAt(i);
                }
            }
            if(q.charAt(0) == '*' && q.charAt(1) == '.'){
                String exp = "";
                for (int j = 1; j < q.length(); j++){
                    exp += q.charAt(j);
                }
                remFilesWithExp(exp);
            }
            else {
                remFileWithName(q);
            }
        }
    } //удаляет файл
    public void remFilesWithExp(String exp){
        String[] filenames = F.list(new ExtensionFilter(exp));
        for (int i = 0; i < filenames.length; i++) {
            File file = new File(F.getPath() + "/" + filenames[i]);
            file.delete();
        }
    } //удаляет все файлы с заданным расширением
    public void remFileWithName(String exp){
        String[] filenames = F.list(new ExtensionFilter(exp));
        for (int i = 0; i < filenames.length; i++) {
            File file = new File(F.getPath() + "/" + filenames[i]);
            file.delete();
        }
    } //удаляет файл по имени
    public void remFilesToDir(File file){
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                remDir(f);
            }
        }
        if(file.getPath() != F.getPath()){
            file.delete();
            System.out.println("Удаленный файл или папка: " + file.getAbsolutePath());
        }
    } //удаляет файлы из директории
    private static class ExtensionFilter implements FilenameFilter {

        private final String extension;

        public ExtensionFilter(String ext) {
            extension = ext;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(extension);
        }

    }
    //фильтр по расширению

    public void commandCp(String s1, String s2){

        final File fileA = new File(F.getPath() + "/" + s1);
        File file = new File(F.getPath());
        cdToLink(s2);
        final File fileB = new File(F.getPath() + "/" + s1);

        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(fileA);
            outStream = new FileOutputStream(fileB);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, bytesRead);
            }

            inStream.close();
            outStream.close();
        } catch (IOException ex) {
            System.out.println("Не получилось скопировать");
        }
        F = new File(file.getPath());
    } //копирует файлы
    public void commandMv(String s1, String s2){
        boolean b = false;
        for (int i = 0; i < s2.length() - 1; i++){
            if(s2.charAt(i) == '.' && s2.charAt(i + 1) != '.'){
                b = true;
            }
        }
        if(!b){
            commandCp(s1, s2);
            File file = new File(F.getPath() + "/" + s1);
            file.delete();
        }
        if(b){
            File file = new File(F.getPath() + "/" + s1);
            File file1 = new File(F.getPath() + "/" + s2);
            file.renameTo(file1);
        }
    } //переносит файлы
}
