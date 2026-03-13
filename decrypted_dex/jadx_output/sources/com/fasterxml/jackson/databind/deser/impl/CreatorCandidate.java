package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CreatorCandidate {
    protected final AnnotatedWithParams _creator;
    protected final AnnotationIntrospector _intr;
    protected final int _paramCount;
    protected final Param[] _params;

    public static final class Param {
        public final AnnotatedParameter annotated;
        public final JacksonInject.Value injection;
        public final BeanPropertyDefinition propDef;

        public Param(AnnotatedParameter annotatedParameter, BeanPropertyDefinition beanPropertyDefinition, JacksonInject.Value value) {
            this.annotated = annotatedParameter;
            this.propDef = beanPropertyDefinition;
            this.injection = value;
        }
    }

    public CreatorCandidate(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, Param[] paramArr, int i3) {
        this._intr = annotationIntrospector;
        this._creator = annotatedWithParams;
        this._params = paramArr;
        this._paramCount = i3;
    }

    public static CreatorCandidate construct(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition[] beanPropertyDefinitionArr) {
        int parameterCount = annotatedWithParams.getParameterCount();
        Param[] paramArr = new Param[parameterCount];
        for (int i3 = 0; i3 < parameterCount; i3++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i3);
            paramArr[i3] = new Param(parameter, beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i3], annotationIntrospector.findInjectableValue(parameter));
        }
        return new CreatorCandidate(annotationIntrospector, annotatedWithParams, paramArr, parameterCount);
    }

    public AnnotatedWithParams creator() {
        return this._creator;
    }

    public PropertyName explicitParamName(int i3) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i3].propDef;
        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
            return null;
        }
        return beanPropertyDefinition.getFullName();
    }

    public PropertyName findImplicitParamName(int i3) {
        String findImplicitPropertyName = this._intr.findImplicitPropertyName(this._params[i3].annotated);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    public int findOnlyParamWithoutInjection() {
        int i3 = -1;
        for (int i10 = 0; i10 < this._paramCount; i10++) {
            if (this._params[i10].injection == null) {
                if (i3 >= 0) {
                    return -1;
                }
                i3 = i10;
            }
        }
        return i3;
    }

    public JacksonInject.Value injection(int i3) {
        return this._params[i3].injection;
    }

    public int paramCount() {
        return this._paramCount;
    }

    public PropertyName paramName(int i3) {
        BeanPropertyDefinition beanPropertyDefinition = this._params[i3].propDef;
        if (beanPropertyDefinition != null) {
            return beanPropertyDefinition.getFullName();
        }
        return null;
    }

    public AnnotatedParameter parameter(int i3) {
        return this._params[i3].annotated;
    }

    public BeanPropertyDefinition propertyDef(int i3) {
        return this._params[i3].propDef;
    }

    public String toString() {
        return this._creator.toString();
    }
}
