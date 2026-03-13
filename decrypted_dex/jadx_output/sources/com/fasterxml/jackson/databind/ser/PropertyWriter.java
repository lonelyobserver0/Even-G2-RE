package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import java.io.Serializable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class PropertyWriter extends ConcreteBeanPropertyBase implements Serializable {
    public PropertyWriter(BeanPropertyDefinition beanPropertyDefinition) {
        super(beanPropertyDefinition.getMetadata());
    }

    public PropertyWriter(PropertyWriter propertyWriter) {
        super(propertyWriter);
    }
}
