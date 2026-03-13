package t6;

import android.media.AudioDeviceInfo;
import android.media.AudioRecord;
import android.media.MediaFormat;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.util.Log;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1736c {

    /* renamed from: a, reason: collision with root package name */
    public final AudioRecord f21181a;

    /* renamed from: b, reason: collision with root package name */
    public final AutomaticGainControl f21182b;

    /* renamed from: c, reason: collision with root package name */
    public final AcousticEchoCanceler f21183c;

    /* renamed from: d, reason: collision with root package name */
    public final NoiseSuppressor f21184d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21185e;

    /* renamed from: f, reason: collision with root package name */
    public double f21186f;

    public C1736c(C1737d config, MediaFormat mediaFormat) {
        int i3;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        int integer = mediaFormat.getInteger(StubApp.getString2(23466));
        String string2 = StubApp.getString2(23467);
        Integer num = config.f21200o;
        if (num != null) {
            i3 = num.intValue();
        } else {
            int minBufferSize = AudioRecord.getMinBufferSize(integer, mediaFormat.getInteger(string2) == 1 ? 16 : 12, 2);
            if (minBufferSize == -2 || minBufferSize == -1) {
                throw new Exception(StubApp.getString2(23474));
            }
            i3 = minBufferSize * 2;
        }
        this.f21185e = i3;
        int i10 = 16;
        try {
            int i11 = config.f21197l;
            if (mediaFormat.getInteger(string2) != 1) {
                i10 = 12;
            }
            AudioRecord audioRecord = new AudioRecord(i11, integer, i10, 2, this.f21185e);
            if (audioRecord.getState() != 1) {
                throw new Exception(StubApp.getString2(23472));
            }
            String string22 = StubApp.getString2(2376);
            AudioDeviceInfo audioDeviceInfo = config.f21190d;
            if (audioDeviceInfo != null && !audioRecord.setPreferredDevice(audioDeviceInfo)) {
                Log.w(string22, StubApp.getString2(23468) + ((Object) audioDeviceInfo.getProductName()));
            }
            this.f21181a = audioRecord;
            this.f21186f = -160.0d;
            boolean isAvailable = AutomaticGainControl.isAvailable();
            boolean z2 = config.f21191e;
            if (isAvailable) {
                AutomaticGainControl create = AutomaticGainControl.create(audioRecord.getAudioSessionId());
                this.f21182b = create;
                if (create != null) {
                    create.setEnabled(z2);
                }
            } else if (z2) {
                Log.d(string22, StubApp.getString2(23469));
            }
            boolean isAvailable2 = AcousticEchoCanceler.isAvailable();
            boolean z10 = config.f21192f;
            if (isAvailable2) {
                AcousticEchoCanceler create2 = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
                this.f21183c = create2;
                if (create2 != null) {
                    create2.setEnabled(z10);
                }
            } else if (z10) {
                Log.d(string22, StubApp.getString2(23470));
            }
            boolean isAvailable3 = NoiseSuppressor.isAvailable();
            boolean z11 = config.f21193g;
            if (!isAvailable3) {
                if (z11) {
                    Log.d(string22, StubApp.getString2(23471));
                }
            } else {
                NoiseSuppressor create3 = NoiseSuppressor.create(audioRecord.getAudioSessionId());
                this.f21184d = create3;
                if (create3 != null) {
                    create3.setEnabled(z11);
                }
            }
        } catch (IllegalArgumentException e10) {
            throw new Exception(StubApp.getString2(23473), e10);
        }
    }

    public final byte[] a() {
        int i3 = this.f21185e / 2;
        short[] sArr = new short[i3];
        int read = this.f21181a.read(sArr, 0, i3);
        if (read < 0) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(23475));
            if (read == -6) {
                sb2.append(StubApp.getString2(23480));
            } else if (read == -3) {
                sb2.append(StubApp.getString2(23479));
            } else if (read == -2) {
                sb2.append(StubApp.getString2(23478));
            } else if (read != -1) {
                sb2.append(StubApp.getString2(23476));
                sb2.append(read);
                sb2.append(StubApp.getString2(74));
            } else {
                sb2.append(StubApp.getString2(23477));
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            throw new Exception(sb3);
        }
        if (read > 0) {
            Iterator<T> it = ArraysKt.take(sArr, read).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int abs = Math.abs((int) ((Number) it.next()).shortValue());
            while (it.hasNext()) {
                int abs2 = Math.abs((int) ((Number) it.next()).shortValue());
                if (abs < abs2) {
                    abs = abs2;
                }
            }
            this.f21186f = Math.log10(abs / 32767.0d) * 20;
        }
        ByteBuffer order = ByteBuffer.allocate(read * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i10 = 0; i10 < read; i10++) {
            order.putShort(sArr[i10]);
        }
        byte[] array = order.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return array;
    }

    public final void b() {
        this.f21181a.release();
        AutomaticGainControl automaticGainControl = this.f21182b;
        if (automaticGainControl != null) {
            automaticGainControl.release();
        }
        AcousticEchoCanceler acousticEchoCanceler = this.f21183c;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
        }
        NoiseSuppressor noiseSuppressor = this.f21184d;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
        }
    }
}
