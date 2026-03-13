package kotlin.reflect;

import E1.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\tH\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J%\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\b\b\u0000\u0010\u0018*\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001b¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\u0002\u0010\u001eJ\u0011\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\f¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "<init>", "(Lkotlin/reflect/KTypeParameter;)V", "getName", "", "getGenericDeclaration", "getBounds", "", "Ljava/lang/reflect/Type;", "()[Ljava/lang/reflect/Type;", "getTypeName", "equals", "", "other", "", "hashCode", "", "toString", "getAnnotation", "T", "", "annotationClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAnnotations", "()[Ljava/lang/annotation/Annotation;", "getDeclaredAnnotations", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalStdlibApi
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1563#2:231\n1634#2,3:232\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {
    private final KTypeParameter typeParameter;

    public TypeVariableImpl(KTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.typeParameter = typeParameter;
    }

    public boolean equals(Object other) {
        if (!(other instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) other;
        return Intrinsics.areEqual(getName(), typeVariable.getName()) && Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    public final <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        return null;
    }

    public final Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        Type computeJavaType;
        List<KType> upperBounds = this.typeParameter.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.f(upperBounds));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            computeJavaType = TypesJVMKt.computeJavaType((KType) it.next(), true);
            arrayList.add(computeJavaType);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public final Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(a.j("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.typeParameter));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.typeParameter.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
