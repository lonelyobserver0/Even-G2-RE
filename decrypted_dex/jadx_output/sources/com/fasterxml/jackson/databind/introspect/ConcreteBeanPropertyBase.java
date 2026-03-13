package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ConcreteBeanPropertyBase implements BeanProperty, Serializable {
    protected transient List<PropertyName> _aliases;
    protected final PropertyMetadata _metadata;

    public ConcreteBeanPropertyBase(PropertyMetadata propertyMetadata) {
        this._metadata = propertyMetadata == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : propertyMetadata;
    }

    public List<PropertyName> findAliases(MapperConfig<?> mapperConfig) {
        AnnotatedMember member;
        List<PropertyName> list = this._aliases;
        if (list == null) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
            if (annotationIntrospector != null && (member = getMember()) != null) {
                list = annotationIntrospector.findPropertyAliases(member);
            }
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            this._aliases = list;
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonFormat.Value findPropertyFormat(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotatedMember member;
        JsonFormat.Value defaultPropertyFormat = mapperConfig.getDefaultPropertyFormat(cls);
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        JsonFormat.Value findFormat = (annotationIntrospector == null || (member = getMember()) == null) ? null : annotationIntrospector.findFormat(member);
        return defaultPropertyFormat == null ? findFormat == null ? BeanProperty.EMPTY_FORMAT : findFormat : findFormat == null ? defaultPropertyFormat : defaultPropertyFormat.withOverrides(findFormat);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JsonInclude.Value findPropertyInclusion(MapperConfig<?> mapperConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        AnnotatedMember member = getMember();
        if (member == null) {
            return mapperConfig.getDefaultPropertyInclusion(cls);
        }
        JsonInclude.Value defaultInclusion = mapperConfig.getDefaultInclusion(cls, member.getRawType());
        if (annotationIntrospector == null) {
            return defaultInclusion;
        }
        JsonInclude.Value findPropertyInclusion = annotationIntrospector.findPropertyInclusion(member);
        return defaultInclusion == null ? findPropertyInclusion : defaultInclusion.withOverrides(findPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        return this._metadata;
    }

    public boolean isRequired() {
        return this._metadata.isRequired();
    }

    public ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concreteBeanPropertyBase) {
        this._metadata = concreteBeanPropertyBase._metadata;
    }
}
