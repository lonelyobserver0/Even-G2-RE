package Vc;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class n implements o {

    /* renamed from: e, reason: collision with root package name */
    public int f8043e;

    /* renamed from: f, reason: collision with root package name */
    public String f8044f;

    /* renamed from: h, reason: collision with root package name */
    public int f8046h;

    /* renamed from: i, reason: collision with root package name */
    public m f8047i;

    /* renamed from: a, reason: collision with root package name */
    public AudioRecord f8039a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8040b = false;

    /* renamed from: c, reason: collision with root package name */
    public double f8041c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    public double f8042d = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    public int f8045g = 0;
    public j j = null;

    /* renamed from: k, reason: collision with root package name */
    public FileOutputStream f8048k = null;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f8049l = new Handler(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final int[] f8050m = {1, 10, 0, 0, 9, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4};

    @Override // Vc.o
    public final double a() {
        if (this.f8043e > 0) {
            this.f8042d = this.f8041c;
            this.f8041c = 0.0d;
            this.f8043e = 0;
        }
        return this.f8042d;
    }

    @Override // Vc.o
    public final void b(Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, int i3, String str, int i10, boolean z2, boolean z10, j jVar) {
        this.j = jVar;
        this.f8046h = i3;
        int i11 = num.intValue() == 1 ? 16 : 12;
        int c10 = AbstractC1856e.c(this.f8046h);
        int[] iArr = this.f8050m;
        int i12 = iArr[c10];
        int max = Math.max(AudioRecord.getMinBufferSize(num2.intValue(), i11, iArr[AbstractC1856e.c(this.f8046h)]) * 2, num4.intValue());
        AudioRecord audioRecord = new AudioRecord(i10, num2.intValue(), i11, i12, max);
        this.f8039a = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new Exception(StubApp.getString2(25799));
        }
        if (z2) {
            NoiseSuppressor.create(this.f8039a.getAudioSessionId());
        }
        if (z10) {
            AcousticEchoCanceler.create(this.f8039a.getAudioSessionId());
        }
        this.f8039a.startRecording();
        this.f8040b = true;
        try {
            g(this.f8046h, num2.intValue(), num.intValue(), str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        m mVar = new m(this, num, bool, max);
        this.f8047i = mVar;
        this.f8049l.post(mVar);
    }

    @Override // Vc.o
    public final void c() {
        AudioRecord audioRecord = this.f8039a;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception unused) {
            }
            try {
                this.f8040b = false;
                this.f8039a.release();
            } catch (Exception unused2) {
            }
            this.f8039a = null;
        }
        FileOutputStream fileOutputStream = this.f8048k;
        if (fileOutputStream != null) {
            fileOutputStream.close();
            if (this.f8046h == 8) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f8044f, StubApp.getString2(1273));
                randomAccessFile.seek(4L);
                int i3 = this.f8045g + 36;
                randomAccessFile.write(i3);
                randomAccessFile.write(i3 >> 8);
                randomAccessFile.write(i3 >> 16);
                randomAccessFile.write(i3 >> 24);
                randomAccessFile.seek(40L);
                randomAccessFile.write(this.f8045g);
                randomAccessFile.write(this.f8045g >> 8);
                randomAccessFile.write(this.f8045g >> 16);
                randomAccessFile.write(this.f8045g >> 24);
                randomAccessFile.close();
            }
        }
    }

    @Override // Vc.o
    public final boolean d() {
        try {
            this.f8039a.startRecording();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // Vc.o
    public final boolean e() {
        try {
            this.f8039a.stop();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final void f(float[] fArr) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i3 = 0; i3 < length / 2; i3++) {
            float abs = Math.abs(fArr[i3]);
            if (abs > f10) {
                f10 = abs;
            }
        }
        double d8 = f10 * 32767.0f;
        if (d8 > this.f8041c) {
            this.f8041c = d8;
        }
        this.f8043e++;
    }

    public final void g(int i3, int i10, int i11, String str) {
        System.out.println(StubApp.getString2(25816));
        this.f8045g = 0;
        this.f8048k = null;
        this.f8044f = str;
        if (str != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f8044f);
            this.f8048k = fileOutputStream;
            if (i3 == 8) {
                short s10 = (short) i11;
                Ec.l.x(fileOutputStream, StubApp.getString2(25817));
                Ec.l.y(fileOutputStream, 100036);
                Ec.l.x(fileOutputStream, StubApp.getString2(25818));
                Ec.l.x(fileOutputStream, StubApp.getString2(25819));
                Ec.l.y(fileOutputStream, 16);
                fileOutputStream.write(1);
                fileOutputStream.write(0);
                fileOutputStream.write(s10);
                fileOutputStream.write(s10 >> 8);
                Ec.l.y(fileOutputStream, i10);
                Ec.l.y(fileOutputStream, ((i10 * s10) * 16) / 8);
                short s11 = (short) ((s10 * 16) / 8);
                fileOutputStream.write(s11);
                fileOutputStream.write(s11 >> 8);
                fileOutputStream.write(16);
                fileOutputStream.write(0);
                Ec.l.x(fileOutputStream, StubApp.getString2(1485));
                Ec.l.y(fileOutputStream, 100000);
            }
        }
        System.out.println(StubApp.getString2(25820));
    }

    public final int h(Integer num, Boolean bool, int i3) {
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        int read = this.f8039a.read(allocate.array(), 0, i3, 1);
        if (read == 0) {
            return 0;
        }
        this.f8045g += read;
        FileOutputStream fileOutputStream = this.f8048k;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.write(allocate.array(), 0, read);
            } catch (Exception e10) {
                System.out.println(e10);
            }
        } else {
            boolean booleanValue = bool.booleanValue();
            Handler handler = this.f8049l;
            if (booleanValue) {
                handler.post(new l(this, Arrays.copyOfRange(allocate.array(), 0, read), 1));
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(allocate.array(), 0, read);
                ArrayList arrayList = new ArrayList();
                int length = copyOfRange.length;
                for (int i10 = 0; i10 < num.intValue(); i10++) {
                    int intValue = length / num.intValue();
                    byte[] bArr = new byte[intValue];
                    for (int i11 = 0; i11 < intValue / 2; i11++) {
                        int intValue2 = ((num.intValue() * i11) + i10) * 2;
                        int i12 = i11 * 2;
                        bArr[i12] = copyOfRange[intValue2];
                        bArr[i12 + 1] = copyOfRange[intValue2 + 1];
                    }
                    arrayList.add(bArr);
                }
                handler.post(new k(this, arrayList, 1));
            }
        }
        byte[] array = allocate.array();
        int length2 = array.length;
        for (int i13 = 0; i13 < length2 / 2; i13++) {
            int i14 = i13 * 2;
            double abs = Math.abs((int) ((short) ((array[i14 + 1] << 8) | array[i14])));
            if (abs > this.f8041c) {
                this.f8041c = abs;
            }
        }
        this.f8043e++;
        return read;
    }

    public final int i(Integer num, int i3) {
        int i10 = i3 / 4;
        FloatBuffer allocate = FloatBuffer.allocate(i10);
        int read = this.f8039a.read(allocate.array(), 0, i10, 1);
        if (read > 0) {
            this.f8045g += read;
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < num.intValue(); i11++) {
                int intValue = read / num.intValue();
                FloatBuffer allocate2 = FloatBuffer.allocate(intValue);
                for (int i12 = 0; i12 < intValue; i12++) {
                    allocate2.array()[i12] = allocate.array()[(num.intValue() * i12) + i11];
                }
                arrayList.add(allocate2.array());
            }
            this.f8049l.post(new k(this, arrayList, 0));
            f(allocate.array());
        }
        return read;
    }

    public final int j(Integer num, Boolean bool, int i3) {
        int i10 = i3 / 4;
        FloatBuffer allocate = FloatBuffer.allocate(i10);
        int read = this.f8039a.read(allocate.array(), 0, i10, 1) * 4;
        if (read > 0) {
            this.f8045g += read;
            if (!bool.booleanValue()) {
                FloatBuffer allocate2 = FloatBuffer.allocate(i10);
                int intValue = read / num.intValue();
                for (int i11 = 0; i11 < num.intValue(); i11++) {
                    int intValue2 = read / (num.intValue() * 4);
                    for (int i12 = 0; i12 < intValue2; i12++) {
                        allocate2.array()[(i11 * intValue2) + i12] = allocate.array()[(num.intValue() * i12) + i11];
                    }
                }
                allocate = allocate2;
            }
            ByteBuffer allocate3 = ByteBuffer.allocate(i3);
            allocate3.rewind();
            allocate3.order(ByteOrder.nativeOrder());
            allocate.rewind();
            allocate3.rewind();
            allocate3.asFloatBuffer().put(allocate);
            this.f8049l.post(new l(this, Arrays.copyOfRange(allocate3.array(), 0, read), 0));
            f(allocate.array());
        }
        return read;
    }
}
