package kotlin.jvm.internal;

import X2.u;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import p0.AbstractC1482f;

@SinceKotlin(version = "1.4")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0013\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rH\u0002J\f\u0010$\u001a\u00020#*\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001dR\u001c\u0010&\u001a\u00020#*\u0006\u0012\u0002\b\u00030'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "platformTypeUpperBound", "flags", "", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getArguments", "()Ljava/util/List;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getFlags$kotlin_stdlib$annotations", "getFlags$kotlin_stdlib", "()I", "annotations", "", "getAnnotations", "()Z", "equals", "other", "", "hashCode", "toString", "", "asString", "convertPrimitiveToWrapper", "arrayClassName", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class TypeReference implements KType {
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final List<KTypeProjection> arguments;
    private final KClassifier classifier;
    private final int flags;
    private final KType platformTypeUpperBound;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.6")
    public TypeReference(KClassifier classifier, List<KTypeProjection> arguments, KType kType, int i3) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = kType;
        this.flags = i3;
    }

    private final String asString(boolean convertPrimitiveToWrapper) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class<?> javaClass = kClass != null ? JvmClassMappingKt.getJavaClass(kClass) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            name = getArrayClassName(javaClass);
        } else if (convertPrimitiveToWrapper && javaClass.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            Intrinsics.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.getJavaObjectType((KClass) classifier2).getName();
        } else {
            name = javaClass.getName();
        }
        String h2 = AbstractC1482f.h(name, getArguments().isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new u(this, 4), 24, null), isMarkedNullable() ? "?" : "");
        KType kType = this.platformTypeUpperBound;
        if (!(kType instanceof TypeReference)) {
            return h2;
        }
        String asString = ((TypeReference) kType).asString(true);
        if (Intrinsics.areEqual(asString, h2)) {
            return h2;
        }
        if (Intrinsics.areEqual(asString, h2 + '?')) {
            return h2 + '!';
        }
        return "(" + h2 + ".." + asString + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence asString$lambda$0(TypeReference typeReference, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return typeReference.asString(it);
    }

    private final String getArrayClassName(Class<?> cls) {
        return Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public boolean equals(Object other) {
        if (!(other instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) other;
        return Intrinsics.areEqual(getClassifier(), typeReference.getClassifier()) && Intrinsics.areEqual(getArguments(), typeReference.getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.classifier;
    }

    /* renamed from: getFlags$kotlin_stdlib, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* renamed from: getPlatformTypeUpperBound$kotlin_stdlib, reason: from getter */
    public final KType getPlatformTypeUpperBound() {
        return this.platformTypeUpperBound;
    }

    public int hashCode() {
        return Integer.hashCode(this.flags) + ((getArguments().hashCode() + (getClassifier().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public String toString() {
        return AbstractC1482f.k(new StringBuilder(), asString(false), " (Kotlin reflection is not available)");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(KClassifier classifier, List<KTypeProjection> arguments, boolean z2) {
        this(classifier, arguments, null, z2 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }

    private final String asString(KTypeProjection kTypeProjection) {
        String valueOf;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        KType type = kTypeProjection.getType();
        TypeReference typeReference = type instanceof TypeReference ? (TypeReference) type : null;
        if (typeReference == null || (valueOf = typeReference.asString(true)) == null) {
            valueOf = String.valueOf(kTypeProjection.getType());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[kTypeProjection.getVariance().ordinal()];
        if (i3 == 1) {
            return valueOf;
        }
        if (i3 == 2) {
            return "in ".concat(valueOf);
        }
        if (i3 == 3) {
            return "out ".concat(valueOf);
        }
        throw new NoWhenBranchMatchedException();
    }
}
