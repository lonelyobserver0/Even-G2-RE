package Xa;

import android.content.Context;
import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: Xa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0361a {

    /* renamed from: e, reason: collision with root package name */
    public static final Matrix f8518e = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f8519a;

    /* renamed from: b, reason: collision with root package name */
    public final E f8520b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8521c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8522d = new HashMap();

    public C0361a(io.flutter.embedding.engine.renderer.l lVar, boolean z2) {
        this.f8519a = lVar;
        if (E.f8515c == null) {
            E.f8515c = new E();
        }
        this.f8520b = E.f8515c;
        this.f8521c = z2;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 != 1) {
            if (i3 == 5) {
                return 4;
            }
            if (i3 != 6) {
                if (i3 == 2) {
                    return 5;
                }
                if (i3 != 7) {
                    if (i3 == 3) {
                        return 0;
                    }
                    if (i3 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    public final void a(MotionEvent motionEvent, int i3, int i10, int i11, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i12;
        int i13;
        int i14;
        long j;
        long j3;
        int i15;
        long j10;
        long j11;
        double d8;
        double d10;
        double d11;
        boolean z2;
        double d12;
        double d13;
        double d14;
        InputDevice.MotionRange motionRange;
        if (i10 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i3);
        int toolType = motionEvent.getToolType(i3);
        if (toolType == 1) {
            i12 = 0;
        } else if (toolType != 2) {
            i12 = 3;
            if (toolType == 3) {
                i12 = 1;
            } else if (toolType != 4) {
                i12 = 5;
            }
        } else {
            i12 = 2;
        }
        float[] fArr = {motionEvent.getX(i3), motionEvent.getY(i3)};
        matrix.mapPoints(fArr);
        HashMap hashMap = this.f8522d;
        if (i12 == 1) {
            i14 = 0;
            j = 0;
            j3 = motionEvent.getButtonState() & 31;
            if (j3 == 0) {
                i13 = 1;
                if (motionEvent.getSource() == 8194 && i10 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i13 = 1;
            }
        } else {
            i13 = 1;
            i14 = 0;
            j = 0;
            j3 = i12 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i15 = i10 == 4 ? 7 : i10 == 5 ? 8 : (i10 == 6 || i10 == 0) ? 9 : -1;
            if (i15 == -1) {
                return;
            }
        } else {
            i15 = -1;
        }
        if (this.f8521c) {
            E e10 = this.f8520b;
            e10.getClass();
            j10 = j3;
            j11 = D.f8513b.incrementAndGet();
            e10.f8516a.put(j11, MotionEvent.obtain(motionEvent));
            e10.f8517b.add(Long.valueOf(j11));
        } else {
            j10 = j3;
            j11 = j;
        }
        int i16 = motionEvent.getActionMasked() == 8 ? i13 : i14;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j11);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i15);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i10);
            byteBuffer.putLong(i12);
        }
        byteBuffer.putLong(i16);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(j);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[i14]);
            byteBuffer.putDouble(fArr2[i13]);
        } else {
            byteBuffer.putDouble(fArr[i14]);
            byteBuffer.putDouble(fArr[i13]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j10);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i3));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d8 = 1.0d;
            d10 = 0.0d;
        } else {
            d10 = motionRange.getMin();
            d8 = motionRange.getMax();
        }
        byteBuffer.putDouble(d10);
        byteBuffer.putDouble(d8);
        if (i12 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i3));
            d11 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d11 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i3));
        byteBuffer.putDouble(motionEvent.getToolMajor(i3));
        byteBuffer.putDouble(motionEvent.getToolMinor(i3));
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i3));
        if (i12 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i3));
        } else {
            byteBuffer.putDouble(d11);
        }
        byteBuffer.putLong(i11);
        if (i16 == i13) {
            if (context != null) {
                d13 = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                d14 = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
            } else {
                d13 = 48.0d;
                d14 = 48.0d;
            }
            z2 = containsKey;
            byteBuffer.putDouble(d13 * (-motionEvent.getAxisValue(10, i3)));
            byteBuffer.putDouble(d14 * (-motionEvent.getAxisValue(9, i3)));
        } else {
            z2 = containsKey;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (z2) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[i14] - fArr3[i14]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d12 = 0.0d;
        } else {
            d12 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d12);
        byteBuffer.putLong(0L);
        if (z2 && i15 == 9) {
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r6 != 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa.C0361a.c(android.view.MotionEvent, android.graphics.Matrix):void");
    }
}
