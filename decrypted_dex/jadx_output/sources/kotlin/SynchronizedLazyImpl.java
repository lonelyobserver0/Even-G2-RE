package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {
    private volatile Object _value;
    private Function0<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(Function0<? extends T> initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
        this._value = UNINITIALIZED_VALUE.INSTANCE;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t3;
        T t10 = (T) this._value;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (t10 != uninitialized_value) {
            return t10;
        }
        synchronized (this.lock) {
            t3 = (T) this._value;
            if (t3 == uninitialized_value) {
                Function0<? extends T> function0 = this.initializer;
                Intrinsics.checkNotNull(function0);
                t3 = function0.invoke();
                this._value = t3;
                this.initializer = null;
            }
        }
        return t3;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this._value != UNINITIALIZED_VALUE.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(Function0 function0, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i3 & 2) != 0 ? null : obj);
    }
}
