package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ClassStack {
    protected final Class<?> _current;
    protected final ClassStack _parent;
    private ArrayList<ResolvedRecursiveType> _selfRefs;

    public ClassStack(Class<?> cls) {
        this(null, cls);
    }

    public void addSelfReference(ResolvedRecursiveType resolvedRecursiveType) {
        if (this._selfRefs == null) {
            this._selfRefs = new ArrayList<>();
        }
        this._selfRefs.add(resolvedRecursiveType);
    }

    public ClassStack child(Class<?> cls) {
        return new ClassStack(this, cls);
    }

    public ClassStack find(Class<?> cls) {
        if (this._current == cls) {
            return this;
        }
        for (ClassStack classStack = this._parent; classStack != null; classStack = classStack._parent) {
            if (classStack._current == cls) {
                return classStack;
            }
        }
        return null;
    }

    public void resolveSelfReferences(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11034));
        ArrayList<ResolvedRecursiveType> arrayList = this._selfRefs;
        sb2.append(arrayList == null ? StubApp.getString2(824) : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (ClassStack classStack = this; classStack != null; classStack = classStack._parent) {
            sb2.append(' ');
            sb2.append(classStack._current.getName());
        }
        sb2.append(']');
        return sb2.toString();
    }

    private ClassStack(ClassStack classStack, Class<?> cls) {
        this._parent = classStack;
        this._current = cls;
    }
}
