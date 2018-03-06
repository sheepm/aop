package sheepm.libjava;

/**
 * Created by paomo on 2018/3/6.
 */

public class TestCost {

//    mv = cw.visitMethod(ACC_PUBLIC, "method1", "()V", null, null);
//    mv.visitCode();

//    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//    mv.visitLdcInsn("xxxxx");
//    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "print", "(Ljava/lang/String;)V", false);

//    mv.visitInsn(RETURN);
//    mv.visitMaxs(2, 1);
//    mv.visitEnd();

//        mv = cw.visitMethod(ACC_PUBLIC, "method1", "()V", null, null);
//        mv.visitCode();

//        mv.visitLdcInsn("method1");
//        mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
//        mv.visitMethodInsn(INVOKESTATIC, "sheepm/libjava/TimeCache", "setStartTime", "(Ljava/lang/String;J)V", false);

//        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//        mv.visitLdcInsn("xxxxx");
//        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "print", "(Ljava/lang/String;)V", false);

//        mv.visitLdcInsn("method1");
//        mv.visitMethodInsn(INVOKESTATIC, "java/lang/System", "nanoTime", "()J", false);
//        mv.visitMethodInsn(INVOKESTATIC, "sheepm/libjava/TimeCache", "setEndTime", "(Ljava/lang/String;J)V", false);
//        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
//        mv.visitLdcInsn("method1");
//        mv.visitMethodInsn(INVOKESTATIC, "sheepm/libjava/TimeCache", "getMethodTime", "(Ljava/lang/String;)Ljava/lang/String;", false);
//        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);

//        mv.visitInsn(RETURN);
//        mv.visitMaxs(3, 1);
//        mv.visitEnd();


    public void method1(){
        TimeCache.setStartTime("method1",System.nanoTime());
        System.out.print("xxxxx");
        TimeCache.setEndTime("method1",System.nanoTime());
        System.out.println(TimeCache.getMethodTime("method1"));
    }
}
