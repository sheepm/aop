package sheepm.libjava.demo;

import java.io.FileInputStream;

import sheepm.libjava.asm.AnnotationVisitor;
import sheepm.libjava.asm.ClassReader;
import sheepm.libjava.asm.ClassVisitor;
import sheepm.libjava.asm.FieldVisitor;
import sheepm.libjava.asm.MethodVisitor;

import static sheepm.libjava.asm.Opcodes.ASM5;

/**
 * Created by paomo on 2018/3/6.
 */

public class ClassInfoPrinter extends ClassVisitor {

    public ClassInfoPrinter(ClassVisitor cv) {
        super(ASM5, cv);
    }

    public void visit(int version, int access, String name,
                      String signature, String superName, String[] interfaces) {
        System.out.println(name + " extends " + superName + " {");
    }
    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        return null;
    }
    public void visitInnerClass(String name, String outerName,
                                String innerName, int access) {
    }
    public FieldVisitor visitField(int access, String name, String desc,
                                   String signature, Object value) {
        System.out.println("    " + desc + " " + name);
        return null;
    }
    public MethodVisitor visitMethod(int access, String name,
                                     String desc, String signature, String[] exceptions) {
        System.out.println("    " + name + desc);
        return null;
    }
    public void visitEnd() {
        System.out.println("}");
    }
    public static void main(String[] args) throws Exception {
        String classDir = System.getProperty("user.dir") + "/libjava/output/MainActivity.class";
        ClassReader classReader = new ClassReader(new FileInputStream(classDir));
        ClassVisitor classVisitor = new ClassInfoPrinter(null);
        classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
    }
}
