package kotlin.jvm.internal;

import i2.u;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;

@SinceKotlin(version = "1.4")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i3, Class cls, String str, String str2, int i10) {
        this(i3, CallableReference.NO_RECEIVER, cls, str, str2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && Intrinsics.areEqual(this.receiver, adaptedFunctionReference.receiver) && Intrinsics.areEqual(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((u.d(u.d((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return Reflection.renderLambdaToString(this);
    }

    public AdaptedFunctionReference(int i3, Object obj, Class cls, String str, String str2, int i10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i10 & 1) == 1;
        this.arity = i3;
        this.flags = i10 >> 1;
    }
}
