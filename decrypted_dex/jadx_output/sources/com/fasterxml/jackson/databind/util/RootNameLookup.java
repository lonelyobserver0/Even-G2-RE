package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class RootNameLookup implements Serializable {
    protected transient LRUMap<ClassKey, PropertyName> _rootNames = new LRUMap<>(20, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);

    public PropertyName findRootName(JavaType javaType, MapperConfig<?> mapperConfig) {
        return findRootName(javaType.getRawClass(), mapperConfig);
    }

    public PropertyName findRootName(Class<?> cls, MapperConfig<?> mapperConfig) {
        ClassKey classKey = new ClassKey(cls);
        PropertyName propertyName = this._rootNames.get(classKey);
        if (propertyName != null) {
            return propertyName;
        }
        PropertyName findRootName = mapperConfig.getAnnotationIntrospector().findRootName(mapperConfig.introspectClassAnnotations(cls).getClassInfo());
        if (findRootName == null || !findRootName.hasSimpleName()) {
            findRootName = PropertyName.construct(cls.getSimpleName());
        }
        this._rootNames.put(classKey, findRootName);
        return findRootName;
    }
}
