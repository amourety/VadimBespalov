/**
 * Created by amour on 10.05.2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LineNumberReader extends BufferedReader{
    private boolean skip;
    private int lineNumber = 0;
    private boolean mSkip;
    private int mLineNumber = 0;

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setmSkip(boolean mSkip) {
        this.mSkip = mSkip;
    }

    public void setmLineNumber(int mLineNumber) {
        this.mLineNumber = mLineNumber;
    }

    public boolean isSkip() {
        return skip;
    }

    public boolean ismSkip() {
        return mSkip;
    }

    public int getmLineNumber() {
        return mLineNumber;
    }

    public LineNumberReader(Reader in) {
        super(in);
    }
    public LineNumberReader(Reader in, int sz) {
         super(in, sz);
    }
    public int read() throws IOException {
        int m = super.read();
        if (skip) {
            if (m == '\n')
                m = super.read();
            skip = false;
        }
        switch (m) {
            case '\r':
                skip = true;
            case '\n':
                lineNumber++;
                return '\n';
        }
        return m;
    }
    public int getLineNumber() {
        return lineNumber;
    }
    public void mark(int read) throws IOException {
        super.mark(read);
        mLineNumber = lineNumber;
        mSkip    = skip;
    }
    public String readLine() throws IOException {
            String line = super.readLine(skip);
            skip = false;
            if (line != null)
                lineNumber++;
            return line;
        }

    public void reset() throws IOException {
        super.reset();
        lineNumber = mLineNumber;
        skip = mSkip;
        }

}

