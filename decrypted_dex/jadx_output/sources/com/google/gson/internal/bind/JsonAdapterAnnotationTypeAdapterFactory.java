package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    private static final TypeAdapterFactory TREE_TYPE_CLASS_DUMMY_FACTORY;
    private static final TypeAdapterFactory TREE_TYPE_FIELD_DUMMY_FACTORY;
    private final ConcurrentMap<Class<?>, TypeAdapterFactory> adapterFactoryMap = new ConcurrentHashMap();
    private final ConstructorConstructor constructorConstructor;

    public static class DummyTypeAdapterFactory implements TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        TREE_TYPE_CLASS_DUMMY_FACTORY = new DummyTypeAdapterFactory();
        TREE_TYPE_FIELD_DUMMY_FACTORY = new DummyTypeAdapterFactory();
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    private static Object createAdapter(ConstructorConstructor constructorConstructor, Class<?> cls) {
        return constructorConstructor.get(TypeToken.get((Class) cls), true).construct();
    }

    private static JsonAdapter getAnnotation(Class<?> cls) {
        return (JsonAdapter) cls.getAnnotation(JsonAdapter.class);
    }

    private TypeAdapterFactory putFactoryAndGetCurrent(Class<?> cls, TypeAdapterFactory typeAdapterFactory) {
        TypeAdapterFactory putIfAbsent = this.adapterFactoryMap.putIfAbsent(cls, typeAdapterFactory);
        return putIfAbsent != null ? putIfAbsent : typeAdapterFactory;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter annotation = getAnnotation(typeToken.getRawType());
        if (annotation == null) {
            return null;
        }
        return (TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, annotation, true);
    }

    public TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter, boolean z2) {
        TypeAdapter<?> typeAdapter;
        Object createAdapter = createAdapter(constructorConstructor, jsonAdapter.value());
        boolean nullSafe = jsonAdapter.nullSafe();
        if (createAdapter instanceof TypeAdapter) {
            typeAdapter = (TypeAdapter) createAdapter;
        } else if (createAdapter instanceof TypeAdapterFactory) {
            TypeAdapterFactory typeAdapterFactory = (TypeAdapterFactory) createAdapter;
            if (z2) {
                typeAdapterFactory = putFactoryAndGetCurrent(typeToken.getRawType(), typeAdapterFactory);
            }
            typeAdapter = typeAdapterFactory.create(gson, typeToken);
        } else {
            boolean z10 = createAdapter instanceof JsonSerializer;
            if (!z10 && !(createAdapter instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + createAdapter.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z10 ? (JsonSerializer) createAdapter : null, createAdapter instanceof JsonDeserializer ? (JsonDeserializer) createAdapter : null, gson, typeToken, z2 ? TREE_TYPE_CLASS_DUMMY_FACTORY : TREE_TYPE_FIELD_DUMMY_FACTORY, nullSafe);
            nullSafe = false;
            typeAdapter = treeTypeAdapter;
        }
        return (typeAdapter == null || !nullSafe) ? typeAdapter : typeAdapter.nullSafe();
    }

    public boolean isClassJsonAdapterFactory(TypeToken<?> typeToken, TypeAdapterFactory typeAdapterFactory) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(typeAdapterFactory);
        if (typeAdapterFactory == TREE_TYPE_CLASS_DUMMY_FACTORY) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        TypeAdapterFactory typeAdapterFactory2 = this.adapterFactoryMap.get(rawType);
        if (typeAdapterFactory2 != null) {
            return typeAdapterFactory2 == typeAdapterFactory;
        }
        JsonAdapter annotation = getAnnotation(rawType);
        if (annotation == null) {
            return false;
        }
        Class<?> value = annotation.value();
        return TypeAdapterFactory.class.isAssignableFrom(value) && putFactoryAndGetCurrent(rawType, (TypeAdapterFactory) createAdapter(this.constructorConstructor, value)) == typeAdapterFactory;
    }
}
