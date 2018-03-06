package sheepm.libjava;


import java.io.FileInputStream;
import java.io.PrintWriter;

import sheepm.libjava.asm.ClassReader;
import sheepm.libjava.asm.util.ASMifier;
import sheepm.libjava.asm.util.TraceClassVisitor;

/**
 * Created by paomo on 2018/3/6.
 */

public class Asmifer {

    public static void main(String[] args) throws Exception {
        args = new String[]{"sheepm.libjava.TestCost"};
        int i = 0;
        int flags = ClassReader.SKIP_DEBUG;

        boolean ok = true;
        if (args.length < 1 || args.length > 2) {
            ok = false;
        }
        if (ok && "-debug".equals(args[0])) {
            i = 1;
            flags = 0;
            if (args.length != 2) {
                ok = false;
            }
        }
        if (!ok) {
            System.err
                    .println("Prints the ASM code to generate the given class.");
            System.err.println("Usage: ASMifier [-debug] "
                    + "<fully qualified class name or class file name>");
            return;
        }
        ClassReader cr;
        if (args[i].endsWith(".class") || args[i].indexOf('\\') > -1
                || args[i].indexOf('/') > -1) {
            cr = new ClassReader(new FileInputStream(args[i]));
        } else {
            cr = new ClassReader(args[i]);
        }
        cr.accept(new TraceClassVisitor(null, new ASMifier(), new PrintWriter(
                System.out)), flags);
    }
}
