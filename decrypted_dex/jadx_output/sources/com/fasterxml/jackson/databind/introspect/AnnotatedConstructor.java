package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AnnotatedConstructor extends AnnotatedWithParams {
    protected final Constructor<?> _constructor;

    public AnnotatedConstructor(TypeResolutionContext typeResolutionContext, Constructor<?> constructor, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap, annotationMapArr);
        if (constructor == null) {
            throw new IllegalArgumentException(StubApp.getString2(10780));
        }
        this._constructor = constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call() throws Exception {
        return this._constructor.newInstance(null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call1(Object obj) throws Exception {
        return this._constructor.newInstance(obj);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, AnnotatedConstructor.class)) {
            return false;
        }
        Constructor<?> constructor = ((AnnotatedConstructor) obj)._constructor;
        return constructor == null ? this._constructor == null : constructor.equals(this._constructor);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Class<?> getDeclaringClass() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Member getMember() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._constructor.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public int getParameterCount() {
        return this._constructor.getParameterCount();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public JavaType getParameterType(int i3) {
        Type[] genericParameterTypes = this._constructor.getGenericParameterTypes();
        if (i3 >= genericParameterTypes.length) {
            return null;
        }
        return this._typeContext.resolveType(genericParameterTypes[i3]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public Class<?> getRawParameterType(int i3) {
        Class<?>[] parameterTypes = this._constructor.getParameterTypes();
        if (i3 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i3];
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._constructor.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._typeContext.resolveType(getRawType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public Object getValue(Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(StubApp.getString2(10781).concat(getDeclaringClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._constructor.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public void setValue(Object obj, Object obj2) throws UnsupportedOperationException {
        throw new UnsupportedOperationException(StubApp.getString2(10782).concat(getDeclaringClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        int parameterCount = this._constructor.getParameterCount();
        return String.format(StubApp.getString2(10783), ClassUtil.nameOf(this._constructor.getDeclaringClass()), Integer.valueOf(parameterCount), parameterCount == 1 ? "" : StubApp.getString2(1313), this._annotations);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
    public final Object call(Object[] objArr) throws Exception {
        return this._constructor.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Constructor<?> getAnnotated() {
        return this._constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
    public AnnotatedConstructor withAnnotations(AnnotationMap annotationMap) {
        return new AnnotatedConstructor(this._typeContext, this._constructor, annotationMap, this._paramAnnotations);
    }
}
