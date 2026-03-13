package com.fasterxml.jackson.databind.deser.impl;

import Xa.h;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.stub.StubApp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JavaUtilCollectionsDeserializers {

    public static class JavaUtilCollectionsConverter implements Converter<Object, Object> {
        private final JavaType _inputType;
        private final int _kind;

        public JavaUtilCollectionsConverter(int i3, JavaType javaType) {
            this._inputType = javaType;
            this._kind = i3;
        }

        private void _checkSingleton(int i3) {
            if (i3 != 1) {
                throw new IllegalArgumentException(h.g(i3, StubApp.getString2(10681), StubApp.getString2(10423)));
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this._kind) {
                case 1:
                    Set set = (Set) obj;
                    _checkSingleton(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    _checkSingleton(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    _checkSingleton(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getInputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public JavaType getOutputType(TypeFactory typeFactory) {
            return this._inputType;
        }
    }

    private static String _findSingletonTypeName(String str) {
        if (str.startsWith(StubApp.getString2(10682))) {
            return str.substring(9);
        }
        return null;
    }

    private static String _findSyncTypeName(String str) {
        if (str.startsWith(StubApp.getString2(10683))) {
            return str.substring(12);
        }
        return null;
    }

    private static String _findUnmodifiableTypeName(String str) {
        if (str.startsWith(StubApp.getString2(10684))) {
            return str.substring(12);
        }
        return null;
    }

    private static String _findUtilArrayTypeName(String str) {
        if (str.startsWith(StubApp.getString2(10685))) {
            return str.substring(17);
        }
        return null;
    }

    private static String _findUtilCollectionsImmutableTypeName(String str) {
        if (str.startsWith(StubApp.getString2(10686))) {
            return str.substring(31);
        }
        return null;
    }

    private static String _findUtilCollectionsTypeName(String str) {
        if (str.startsWith(StubApp.getString2(10687))) {
            return str.substring(22);
        }
        return null;
    }

    public static JavaUtilCollectionsConverter converter(int i3, JavaType javaType, Class<?> cls) {
        return new JavaUtilCollectionsConverter(i3, javaType.findSuperType(cls));
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        JavaUtilCollectionsConverter converter;
        String name = javaType.getRawClass().getName();
        if (!name.startsWith(StubApp.getString2(10688))) {
            return null;
        }
        String _findUtilCollectionsTypeName = _findUtilCollectionsTypeName(name);
        String string2 = StubApp.getString2(10689);
        String string22 = StubApp.getString2(10690);
        if (_findUtilCollectionsTypeName == null) {
            String _findUtilArrayTypeName = _findUtilArrayTypeName(name);
            if (_findUtilArrayTypeName != null) {
                if (_findUtilArrayTypeName.contains(string22)) {
                    return new StdDelegatingDeserializer(converter(11, javaType, List.class));
                }
                return null;
            }
            String _findUtilCollectionsImmutableTypeName = _findUtilCollectionsImmutableTypeName(name);
            if (_findUtilCollectionsImmutableTypeName != null) {
                if (_findUtilCollectionsImmutableTypeName.contains(string22)) {
                    return new StdDelegatingDeserializer(converter(11, javaType, List.class));
                }
                if (_findUtilCollectionsImmutableTypeName.contains(string2)) {
                    return new StdDelegatingDeserializer(converter(4, javaType, Set.class));
                }
            }
            return null;
        }
        String _findUnmodifiableTypeName = _findUnmodifiableTypeName(_findUtilCollectionsTypeName);
        if (_findUnmodifiableTypeName == null) {
            String _findSingletonTypeName = _findSingletonTypeName(_findUtilCollectionsTypeName);
            if (_findSingletonTypeName == null) {
                String _findSyncTypeName = _findSyncTypeName(_findUtilCollectionsTypeName);
                if (_findSyncTypeName != null) {
                    if (_findSyncTypeName.endsWith(string2)) {
                        converter = converter(7, javaType, Set.class);
                    } else if (_findSyncTypeName.endsWith(string22)) {
                        converter = converter(9, javaType, List.class);
                    } else if (_findSyncTypeName.endsWith(StubApp.getString2(10691))) {
                        converter = converter(8, javaType, Collection.class);
                    }
                }
                converter = null;
            } else if (_findSingletonTypeName.endsWith(string2)) {
                converter = converter(1, javaType, Set.class);
            } else {
                if (_findSingletonTypeName.endsWith(string22)) {
                    converter = converter(2, javaType, List.class);
                }
                converter = null;
            }
        } else if (_findUnmodifiableTypeName.endsWith(string2)) {
            converter = converter(4, javaType, Set.class);
        } else {
            if (_findUnmodifiableTypeName.endsWith(string22)) {
                converter = converter(5, javaType, List.class);
            }
            converter = null;
        }
        if (converter == null) {
            return null;
        }
        return new StdDelegatingDeserializer(converter);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        JavaUtilCollectionsConverter converter;
        String name = javaType.getRawClass().getName();
        String _findUtilCollectionsTypeName = _findUtilCollectionsTypeName(name);
        String string2 = StubApp.getString2(10692);
        if (_findUtilCollectionsTypeName != null) {
            String _findUnmodifiableTypeName = _findUnmodifiableTypeName(_findUtilCollectionsTypeName);
            if (_findUnmodifiableTypeName != null) {
                if (_findUnmodifiableTypeName.contains(string2)) {
                    converter = converter(6, javaType, Map.class);
                }
                converter = null;
            } else {
                String _findSingletonTypeName = _findSingletonTypeName(_findUtilCollectionsTypeName);
                if (_findSingletonTypeName != null) {
                    if (_findSingletonTypeName.contains(string2)) {
                        converter = converter(3, javaType, Map.class);
                    }
                    converter = null;
                } else {
                    String _findSyncTypeName = _findSyncTypeName(_findUtilCollectionsTypeName);
                    if (_findSyncTypeName != null && _findSyncTypeName.contains(string2)) {
                        converter = converter(10, javaType, Map.class);
                    }
                    converter = null;
                }
            }
        } else {
            String _findUtilCollectionsImmutableTypeName = _findUtilCollectionsImmutableTypeName(name);
            if (_findUtilCollectionsImmutableTypeName != null && _findUtilCollectionsImmutableTypeName.contains(string2)) {
                converter = converter(6, javaType, Map.class);
            }
            converter = null;
        }
        if (converter == null) {
            return null;
        }
        return new StdDelegatingDeserializer(converter);
    }
}
