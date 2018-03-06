package sheepm.libjava.demo;

import sheepm.libjava.asm.ClassVisitor;
import sheepm.libjava.asm.FieldVisitor;

import static sheepm.libjava.asm.Opcodes.ASM5;

/**
 * Created by paomo on 2018/3/6.
 */

public class AddField extends ClassVisitor{

    private String name;
    private int access;
    private String desc;
    private Object value;

    private boolean duplicate;

    public AddField(ClassVisitor cv,String name,int access,String desc,Object value) {
        super(ASM5, cv);
        this.name = name;
        this.access = access;
        this.desc = desc;
        this.value = value;
    }

    @Override
    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        if (this.name.equals(name)){
            duplicate = true;
        }
        return super.visitField(access, name, desc, signature, value);
    }

    @Override
    public void visitEnd() {
        if (!duplicate){
            FieldVisitor fv = super.visitField(access, name, desc, null, value);
            if (fv != null){
                fv.visitEnd();
            }
        }
        super.visitEnd();
    }
}
