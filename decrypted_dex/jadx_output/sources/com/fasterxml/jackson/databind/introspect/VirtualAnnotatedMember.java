package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    protected final Class<?> _declaringClass;
    protected final String _name;
    protected final JavaType _type;

    public VirtualAnnotatedMember(TypeResolutionContext typeResolutionContext, Class<?> cls, String str, JavaType javaType) {
        super(typeResolutionContext, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Field getAnnotated() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._name;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException(AbstractC1482f.k(new StringBuilder("Cannot get virtual property '"), this._name, "'"));
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._name.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException(AbstractC1482f.k(new StringBuilder("Cannot set virtual property '"), this._name, "'"));
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Annotated withAnnotations(AnnotationMap annotationMap) {
        return this;
    }
}
