package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    protected final AnnotationMap[] _paramAnnotations;

    public AnnotatedWithParams(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap, AnnotationMap[] annotationMapArr) {
        super(typeResolutionContext, annotationMap);
        this._paramAnnotations = annotationMapArr;
    }

    public abstract Object call() throws Exception;

    public abstract Object call(Object[] objArr) throws Exception;

    public abstract Object call1(Object obj) throws Exception;

    public final AnnotatedParameter getParameter(int i3) {
        return new AnnotatedParameter(this, getParameterType(i3), this._typeContext, getParameterAnnotations(i3), i3);
    }

    public final AnnotationMap getParameterAnnotations(int i3) {
        AnnotationMap[] annotationMapArr = this._paramAnnotations;
        if (annotationMapArr == null || i3 < 0 || i3 >= annotationMapArr.length) {
            return null;
        }
        return annotationMapArr[i3];
    }

    public abstract int getParameterCount();

    public abstract JavaType getParameterType(int i3);

    public abstract Class<?> getRawParameterType(int i3);

    public AnnotatedParameter replaceParameterAnnotations(int i3, AnnotationMap annotationMap) {
        this._paramAnnotations[i3] = annotationMap;
        return getParameter(i3);
    }
}
