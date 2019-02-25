
/**
 * Created by amour on 05.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        GraphicPic graphicPic = new GraphicPic();

        graphicPic.add(new Segment(0,0,2*Math.sqrt(3),2));
        graphicPic.add(new Segment(1,1,2,9));
        graphicPic.add(new Segment(1,1,2,8));
        graphicPic.add(new Segment(1,1,2,7));
        graphicPic.add(new Segment(1,1,2,7));

        graphicPic.show();

        //сортировка
        graphicPic = graphicPic.sort();
        graphicPic.show();

        //по углу
        GraphicPic graphicPic1 = graphicPic.angleList();
        graphicPic1.show();

        //по длине
        GraphicPic graphicPic2 = graphicPic.lengthList(3,8);
        graphicPic2.show();

        //с файла
        GraphicPic graphicPic3 = new GraphicPic("text.txt");
        graphicPic3.show();



    }
}
