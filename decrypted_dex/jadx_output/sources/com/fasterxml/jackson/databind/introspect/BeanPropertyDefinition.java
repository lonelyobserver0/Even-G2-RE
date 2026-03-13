package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.Named;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BeanPropertyDefinition implements Named {
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();

    public boolean couldDeserialize() {
        return getMutator() != null;
    }

    public boolean couldSerialize() {
        return getAccessor() != null;
    }

    public abstract JsonInclude.Value findInclusion();

    public ObjectIdInfo findObjectIdInfo() {
        return null;
    }

    public String findReferenceName() {
        AnnotationIntrospector.ReferenceProperty findReferenceType = findReferenceType();
        if (findReferenceType == null) {
            return null;
        }
        return findReferenceType.getName();
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        return null;
    }

    public Class<?>[] findViews() {
        return null;
    }

    public AnnotatedMember getAccessor() {
        AnnotatedMethod getter = getGetter();
        return getter == null ? getField() : getter;
    }

    public abstract AnnotatedParameter getConstructorParameter();

    public abstract Iterator<AnnotatedParameter> getConstructorParameters();

    public abstract AnnotatedField getField();

    public abstract PropertyName getFullName();

    public abstract AnnotatedMethod getGetter();

    public abstract PropertyMetadata getMetadata();

    public AnnotatedMember getMutator() {
        AnnotatedParameter constructorParameter = getConstructorParameter();
        if (constructorParameter != null) {
            return constructorParameter;
        }
        AnnotatedMethod setter = getSetter();
        return setter == null ? getField() : setter;
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public abstract String getName();

    public AnnotatedMember getNonConstructorMutator() {
        AnnotatedMethod setter = getSetter();
        return setter == null ? getField() : setter;
    }

    public abstract AnnotatedMember getPrimaryMember();

    public abstract JavaType getPrimaryType();

    public abstract Class<?> getRawPrimaryType();

    public abstract AnnotatedMethod getSetter();

    public abstract PropertyName getWrapperName();

    public abstract boolean hasConstructorParameter();

    public abstract boolean hasField();

    public abstract boolean hasName(PropertyName propertyName);

    public abstract boolean hasSetter();

    public abstract boolean isExplicitlyIncluded();

    public abstract boolean isExplicitlyNamed();

    public boolean isTypeId() {
        return false;
    }
}
