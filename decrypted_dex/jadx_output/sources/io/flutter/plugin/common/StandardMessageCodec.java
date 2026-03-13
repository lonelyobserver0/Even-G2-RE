package io.flutter.plugin.common;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class StandardMessageCodec implements MessageCodec<Object> {
    private static final byte BIGINT = 5;
    private static final byte BYTE_ARRAY = 8;
    private static final byte DOUBLE = 6;
    private static final byte DOUBLE_ARRAY = 11;
    private static final byte FALSE = 2;
    private static final byte FLOAT_ARRAY = 14;
    private static final byte INT = 3;
    private static final byte INT_ARRAY = 9;
    private static final byte LIST = 12;
    private static final boolean LITTLE_ENDIAN;
    private static final byte LONG = 4;
    private static final byte LONG_ARRAY = 10;
    private static final byte MAP = 13;
    private static final byte NULL = 0;
    private static final byte STRING = 7;
    private static final byte TRUE = 1;
    private static final Charset UTF8;
    private static final String TAG = StubApp.getString2(18679);
    public static final StandardMessageCodec INSTANCE = new StandardMessageCodec();

    public static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] buffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        LITTLE_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? true : LITTLE_ENDIAN;
        UTF8 = Charset.forName(StubApp.getString2(6206));
    }

    public static final void readAlignment(ByteBuffer byteBuffer, int i3) {
        int position = byteBuffer.position() % i3;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i3) - position);
        }
    }

    public static final byte[] readBytes(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[readSize(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int readSize(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException(StubApp.getString2(18680));
        }
        int i3 = byteBuffer.get() & UByte.MAX_VALUE;
        return i3 < 254 ? i3 : i3 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void writeAlignment(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        int size = byteArrayOutputStream.size() % i3;
        if (size != 0) {
            for (int i10 = 0; i10 < i3 - size; i10++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void writeBytes(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        writeSize(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void writeChar(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i3);
            byteArrayOutputStream.write(i3 >>> 8);
        } else {
            byteArrayOutputStream.write(i3 >>> 8);
            byteArrayOutputStream.write(i3);
        }
    }

    public static final void writeDouble(ByteArrayOutputStream byteArrayOutputStream, double d8) {
        writeLong(byteArrayOutputStream, Double.doubleToLongBits(d8));
    }

    public static final void writeFloat(ByteArrayOutputStream byteArrayOutputStream, float f10) {
        writeInt(byteArrayOutputStream, Float.floatToIntBits(f10));
    }

    public static final void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i3);
            byteArrayOutputStream.write(i3 >>> 8);
            byteArrayOutputStream.write(i3 >>> 16);
            byteArrayOutputStream.write(i3 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i3 >>> 24);
        byteArrayOutputStream.write(i3 >>> 16);
        byteArrayOutputStream.write(i3 >>> 8);
        byteArrayOutputStream.write(i3);
    }

    public static final void writeLong(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    public static final void writeSize(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (i3 < 254) {
            byteArrayOutputStream.write(i3);
        } else if (i3 <= 65535) {
            byteArrayOutputStream.write(254);
            writeChar(byteArrayOutputStream, i3);
        } else {
            byteArrayOutputStream.write(255);
            writeInt(byteArrayOutputStream, i3);
        }
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object readValue = readValue(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException(StubApp.getString2(18680));
        }
        return readValue;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = new ExposedByteArrayOutputStream();
        writeValue(exposedByteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    public final Object readValue(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return readValueOfType(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException(StubApp.getString2(18680));
    }

    public Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        int i3 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(readBytes(byteBuffer), UTF8), 16);
            case 6:
                readAlignment(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(readBytes(byteBuffer), UTF8);
            case 8:
                return readBytes(byteBuffer);
            case 9:
                int readSize = readSize(byteBuffer);
                int[] iArr = new int[readSize];
                readAlignment(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((readSize * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int readSize2 = readSize(byteBuffer);
                long[] jArr = new long[readSize2];
                readAlignment(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((readSize2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int readSize3 = readSize(byteBuffer);
                double[] dArr = new double[readSize3];
                readAlignment(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((readSize3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int readSize4 = readSize(byteBuffer);
                ArrayList arrayList = new ArrayList(readSize4);
                while (i3 < readSize4) {
                    arrayList.add(readValue(byteBuffer));
                    i3++;
                }
                return arrayList;
            case 13:
                int readSize5 = readSize(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i3 < readSize5) {
                    hashMap.put(readValue(byteBuffer), readValue(byteBuffer));
                    i3++;
                }
                return hashMap;
            case 14:
                int readSize6 = readSize(byteBuffer);
                float[] fArr = new float[readSize6];
                readAlignment(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((readSize6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException(StubApp.getString2(18680));
        }
    }

    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i3 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                writeInt(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                writeLong(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                writeAlignment(byteArrayOutputStream, 8);
                writeDouble(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException(StubApp.getString2(18681) + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                writeBytes(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(UTF8));
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            writeBytes(byteArrayOutputStream, obj.toString().getBytes(UTF8));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            writeBytes(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            writeSize(byteArrayOutputStream, iArr.length);
            writeAlignment(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i3 < length) {
                writeInt(byteArrayOutputStream, iArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            writeSize(byteArrayOutputStream, jArr.length);
            writeAlignment(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i3 < length2) {
                writeLong(byteArrayOutputStream, jArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            writeSize(byteArrayOutputStream, dArr.length);
            writeAlignment(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i3 < length3) {
                writeDouble(byteArrayOutputStream, dArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            writeSize(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeValue(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            writeSize(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                writeValue(byteArrayOutputStream, entry.getKey());
                writeValue(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException(StubApp.getString2(18682) + obj + StubApp.getString2(18683) + obj.getClass() + StubApp.getString2(620));
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        writeSize(byteArrayOutputStream, fArr.length);
        writeAlignment(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i3 < length4) {
            writeFloat(byteArrayOutputStream, fArr[i3]);
            i3++;
        }
    }
}
