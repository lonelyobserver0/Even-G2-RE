package kotlin.random;

import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0017B9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "x", "", "y", "z", "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "checkInvariants", "", "readResolve", "", "nextInt", "nextBits", "bitCount", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public XorWowRandom(int i3, int i10, int i11, int i12, int i13, int i14) {
        this.x = i3;
        this.y = i10;
        this.z = i11;
        this.w = i12;
        this.v = i13;
        this.addend = i14;
        checkInvariants();
        for (int i15 = 0; i15 < 64; i15++) {
            nextInt();
        }
    }

    private final void checkInvariants() {
        if ((this.x | this.y | this.z | this.w | this.v) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }

    private final Object readResolve() {
        try {
            checkInvariants();
            return this;
        } catch (Throwable th) {
            Throwable initCause = new InvalidObjectException(th.getMessage()).initCause(th);
            Intrinsics.checkNotNullExpressionValue(initCause, "initCause(...)");
            throw initCause;
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(nextInt(), bitCount);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i3 = this.x;
        int i10 = i3 ^ (i3 >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i11 = this.v;
        this.w = i11;
        int i12 = ((i10 ^ (i10 << 1)) ^ i11) ^ (i11 << 4);
        this.v = i12;
        int i13 = this.addend + 362437;
        this.addend = i13;
        return i12 + i13;
    }

    public XorWowRandom(int i3, int i10) {
        this(i3, i10, 0, 0, ~i3, (i3 << 10) ^ (i10 >>> 4));
    }
}
