package kotlin.uuid;

import Xa.h;
import i2.u;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a,\u0010\n\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0001\u001a\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0014H\u0001\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0001H\u0087\b\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0007\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\r\u0010\u001d\u001a\u00020\u0006*\u00020\u0006H\u0080\b¨\u0006\u001e"}, d2 = {"secureRandomUuid", "Lkotlin/uuid/Uuid;", "serializedUuid", "", "uuid", "getLongAt", "", "", "index", "", "formatBytesInto", "", "dst", "dstOffset", "startIndex", "endIndex", "setLongAt", "value", "uuidParseHexDash", "hexDashString", "", "uuidParseHex", "hexString", "toKotlinUuid", "Ljava/util/UUID;", "toJavaUuid", "getUuid", "Ljava/nio/ByteBuffer;", "putUuid", "reverseBytes", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,277:1\n277#1:278\n277#1:279\n277#1:280\n277#1:281\n277#1:282\n277#1:283\n277#1:284\n277#1:285\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n139#1:278\n140#1:279\n184#1:280\n185#1:281\n224#1:282\n225#1:283\n271#1:284\n272#1:285\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class UuidKt__UuidJVMKt {
    @ExperimentalUuidApi
    public static final void formatBytesInto(long j, byte[] dst, int i3, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        UuidKt__UuidKt.formatBytesIntoCommonImpl(j, dst, i3, i10, i11);
    }

    @ExperimentalUuidApi
    public static final long getLongAt(byte[] bArr, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return UuidKt__UuidKt.getLongAtCommonImpl(bArr, i3);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid getUuid(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long j = byteBuffer.getLong();
        long j3 = byteBuffer.getLong();
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            j = Long.reverseBytes(j);
            j3 = Long.reverseBytes(j3);
        }
        return Uuid.INSTANCE.fromLongs(j, j3);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, Uuid uuid) {
        ByteBuffer putLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            putLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            putLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        Intrinsics.checkNotNullExpressionValue(putLong, "toLongs(...)");
        return putLong;
    }

    public static final long reverseBytes(long j) {
        return Long.reverseBytes(j);
    }

    @ExperimentalUuidApi
    public static final Uuid secureRandomUuid() {
        byte[] bArr = new byte[16];
        SecureRandomHolder.INSTANCE.getInstance().nextBytes(bArr);
        return UuidKt__UuidKt.uuidFromRandomBytes(bArr);
    }

    @ExperimentalUuidApi
    public static final Object serializedUuid(Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @ExperimentalUuidApi
    public static final void setLongAt(byte[] bArr, int i3, long j) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        UuidKt__UuidKt.setLongAtCommonImpl(bArr, i3, j);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final UUID toJavaUuid(Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return new UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid toKotlinUuid(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return Uuid.INSTANCE.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHex(String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return UuidKt__UuidKt.uuidParseHexCommonImpl(hexString);
    }

    @ExperimentalUuidApi
    public static final Uuid uuidParseHexDash(String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return UuidKt__UuidKt.uuidParseHexDashCommonImpl(hexDashString);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final Uuid getUuid(ByteBuffer byteBuffer, int i3) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i3 >= 0) {
            if (i3 + 15 < byteBuffer.limit()) {
                long j = byteBuffer.getLong(i3);
                long j3 = byteBuffer.getLong(i3 + 8);
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    j = Long.reverseBytes(j);
                    j3 = Long.reverseBytes(j3);
                }
                return Uuid.INSTANCE.fromLongs(j, j3);
            }
            StringBuilder u2 = h.u(i3, "Not enough bytes to read a uuid at index: ", ", with limit: ");
            u2.append(byteBuffer.limit());
            u2.append(' ');
            throw new IndexOutOfBoundsException(u2.toString());
        }
        throw new IndexOutOfBoundsException(u.p(i3, "Negative index: "));
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    public static final ByteBuffer putUuid(ByteBuffer byteBuffer, int i3, Uuid uuid) {
        ByteBuffer putLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i3 >= 0) {
            if (i3 + 15 < byteBuffer.limit()) {
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i3, mostSignificantBits);
                    putLong = byteBuffer.putLong(i3 + 8, leastSignificantBits);
                } else {
                    byteBuffer.putLong(i3, Long.reverseBytes(mostSignificantBits));
                    putLong = byteBuffer.putLong(i3 + 8, Long.reverseBytes(leastSignificantBits));
                }
                Intrinsics.checkNotNullExpressionValue(putLong, "toLongs(...)");
                return putLong;
            }
            StringBuilder u2 = h.u(i3, "Not enough capacity to write a uuid at index: ", ", with limit: ");
            u2.append(byteBuffer.limit());
            u2.append(' ');
            throw new IndexOutOfBoundsException(u2.toString());
        }
        throw new IndexOutOfBoundsException(u.p(i3, "Negative index: "));
    }
}
