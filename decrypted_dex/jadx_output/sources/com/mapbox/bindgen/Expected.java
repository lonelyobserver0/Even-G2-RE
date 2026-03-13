package com.mapbox.bindgen;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class Expected<E, V> {
    private final E error;
    private final V value;

    @FunctionalInterface
    public interface Action<T> {
        void run(T t3);
    }

    @FunctionalInterface
    public interface Transformer<T, R> {
        R invoke(T t3);
    }

    public Expected(E e10, V v2) {
        this.value = v2;
        this.error = e10;
    }

    public <R> R fold(Transformer<E, R> transformer, Transformer<V, R> transformer2) {
        return isValue() ? transformer2.invoke(getValue()) : transformer.invoke(getError());
    }

    public E getError() {
        return this.error;
    }

    public V getValue() {
        return this.value;
    }

    public V getValueOrElse(Transformer<E, V> transformer) {
        return isValue() ? getValue() : transformer.invoke(getError());
    }

    public boolean isError() {
        return !isValue();
    }

    public boolean isValue() {
        return this.value != null;
    }

    public <E1, V1> Expected<E1, V1> map(Transformer<E, E1> transformer, Transformer<V, V1> transformer2) {
        return isValue() ? ExpectedFactory.createValue(transformer2.invoke(getValue())) : ExpectedFactory.createError(transformer.invoke(getError()));
    }

    public <E1> Expected<E1, V> mapError(Transformer<E, E1> transformer) {
        return isValue() ? ExpectedFactory.createValue(getValue()) : ExpectedFactory.createError(transformer.invoke(getError()));
    }

    public <V1> Expected<E, V1> mapValue(Transformer<V, V1> transformer) {
        return isValue() ? ExpectedFactory.createValue(transformer.invoke(getValue())) : ExpectedFactory.createError(getError());
    }

    public Expected<E, V> onError(Action<E> action) {
        if (isError()) {
            action.run(getError());
        }
        return this;
    }

    public Expected<E, V> onValue(Action<V> action) {
        if (isValue()) {
            action.run(getValue());
        }
        return this;
    }
}
