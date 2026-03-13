package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.jdk14.JDK14Util;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DefaultAccessorNamingStrategy extends AccessorNamingStrategy {
    protected final MapperConfig<?> _config;
    protected final AnnotatedClass _forClass;
    protected final String _getterPrefix;
    protected final String _isGetterPrefix;
    protected final boolean _isGettersNonBoolean;
    protected final String _mutatorPrefix;
    protected final boolean _stdBeanNaming;

    public interface BaseNameValidator {
    }

    public static class Provider extends AccessorNamingStrategy.Provider implements Serializable {
        protected final String _getterPrefix;
        protected final String _isGetterPrefix;
        protected final String _setterPrefix;
        protected final String _withPrefix;

        public Provider() {
            this("set", "with", "get", "is", null);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forBuilder(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, BeanDescription beanDescription) {
            AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            JsonPOJOBuilder.Value findPOJOBuilderConfig = annotationIntrospector != null ? annotationIntrospector.findPOJOBuilderConfig(annotatedClass) : null;
            return new DefaultAccessorNamingStrategy(mapperConfig, annotatedClass, findPOJOBuilderConfig == null ? this._withPrefix : findPOJOBuilderConfig.withPrefix, this._getterPrefix, this._isGetterPrefix, null);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forPOJO(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            return new DefaultAccessorNamingStrategy(mapperConfig, annotatedClass, this._setterPrefix, this._getterPrefix, this._isGetterPrefix, null);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider
        public AccessorNamingStrategy forRecord(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            return new RecordNaming(mapperConfig, annotatedClass);
        }

        public Provider(String str, String str2, String str3, String str4, BaseNameValidator baseNameValidator) {
            this._setterPrefix = str;
            this._withPrefix = str2;
            this._getterPrefix = str3;
            this._isGetterPrefix = str4;
        }
    }

    public static class RecordNaming extends DefaultAccessorNamingStrategy {
        protected final Set<String> _fieldNames;

        public RecordNaming(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
            super(mapperConfig, annotatedClass, null, StubApp.getString2(6443), StubApp.getString2(10803), null);
            String[] recordFieldNames = JDK14Util.getRecordFieldNames(annotatedClass.getRawType());
            this._fieldNames = recordFieldNames == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(recordFieldNames));
        }

        @Override // com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy, com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
        public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
            return this._fieldNames.contains(str) ? str : super.findNameForRegularGetter(annotatedMethod, str);
        }
    }

    public DefaultAccessorNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, String str, String str2, String str3, BaseNameValidator baseNameValidator) {
        this._config = mapperConfig;
        this._forClass = annotatedClass;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
        this._isGettersNonBoolean = mapperConfig.isEnabled(MapperFeature.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this._mutatorPrefix = str;
        this._getterPrefix = str2;
        this._isGetterPrefix = str3;
    }

    public boolean _isCglibGetCallbacks(AnnotatedMethod annotatedMethod) {
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType.isArray()) {
            String name = rawType.getComponentType().getName();
            if (name.contains(StubApp.getString2(10804))) {
                return name.startsWith(StubApp.getString2(10805)) || name.startsWith(StubApp.getString2(10806)) || name.startsWith(StubApp.getString2(10807));
            }
        }
        return false;
    }

    public boolean _isGroovyMetaClassGetter(AnnotatedMethod annotatedMethod) {
        return annotatedMethod.getRawType().getName().startsWith(StubApp.getString2(10808));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForIsGetter(AnnotatedMethod annotatedMethod, String str) {
        if (this._isGetterPrefix == null) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if ((this._isGettersNonBoolean || rawType == Boolean.class || rawType == Boolean.TYPE) && str.startsWith(this._isGetterPrefix)) {
            return this._stdBeanNaming ? stdManglePropertyName(str, 2) : legacyManglePropertyName(str, 2);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForMutator(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this._mutatorPrefix;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this._stdBeanNaming ? stdManglePropertyName(str, this._mutatorPrefix.length()) : legacyManglePropertyName(str, this._mutatorPrefix.length());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String findNameForRegularGetter(AnnotatedMethod annotatedMethod, String str) {
        String str2 = this._getterPrefix;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if (StubApp.getString2(10809).equals(str)) {
            if (_isCglibGetCallbacks(annotatedMethod)) {
                return null;
            }
        } else if (StubApp.getString2(10810).equals(str) && _isGroovyMetaClassGetter(annotatedMethod)) {
            return null;
        }
        return this._stdBeanNaming ? stdManglePropertyName(str, this._getterPrefix.length()) : legacyManglePropertyName(str, this._getterPrefix.length());
    }

    public String legacyManglePropertyName(String str, int i3) {
        int length = str.length();
        if (length == i3) {
            return null;
        }
        char charAt = str.charAt(i3);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i3);
        }
        StringBuilder sb2 = new StringBuilder(length - i3);
        sb2.append(lowerCase);
        while (true) {
            i3++;
            if (i3 >= length) {
                break;
            }
            char charAt2 = str.charAt(i3);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i3, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy
    public String modifyFieldName(AnnotatedField annotatedField, String str) {
        return str;
    }

    public String stdManglePropertyName(String str, int i3) {
        int length = str.length();
        if (length == i3) {
            return null;
        }
        char charAt = str.charAt(i3);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i3);
        }
        int i10 = i3 + 1;
        if (i10 < length && Character.isUpperCase(str.charAt(i10))) {
            return str.substring(i3);
        }
        StringBuilder sb2 = new StringBuilder(length - i3);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i10, length);
        return sb2.toString();
    }
}
