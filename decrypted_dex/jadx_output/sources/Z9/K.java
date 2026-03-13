package Z9;

import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import com.stub.StubApp;
import ea.InterfaceC0856c;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0856c f9090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9091b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9092c;

    /* renamed from: g, reason: collision with root package name */
    public final PointF f9096g;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public int f9099k;

    /* renamed from: d, reason: collision with root package name */
    public Path f9093d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f9094e = 0;

    /* renamed from: f, reason: collision with root package name */
    public PointF f9095f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9097h = false;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9098i = new ArrayList();

    public K(InterfaceC0856c interfaceC0856c, String str, String str2) {
        this.f9096g = null;
        this.f9090a = interfaceC0856c;
        this.f9091b = str;
        this.f9092c = str2;
        this.f9096g = new PointF(0.0f, 0.0f);
    }

    public final void a() {
        this.f9093d = new Path();
        this.f9095f = new PointF(0.0f, 0.0f);
        this.f9094e = 0;
        new J(this, 0).c(this.j);
    }

    public final void b(Number number, Number number2) {
        PointF pointF = this.f9096g;
        float floatValue = number.floatValue() + pointF.x;
        float floatValue2 = number2.floatValue() + pointF.y;
        if (this.f9093d.isEmpty()) {
            Log.w(StubApp.getString2(948), StubApp.getString2(8139) + this.f9091b + StubApp.getString2(8126) + this.f9092c);
            this.f9093d.moveTo(floatValue, floatValue2);
        } else {
            this.f9093d.lineTo(floatValue, floatValue2);
        }
        pointF.set(floatValue, floatValue2);
    }

    public final void c(Number number, Number number2) {
        PointF pointF = this.f9096g;
        float floatValue = number.floatValue() + pointF.x;
        float floatValue2 = number2.floatValue() + pointF.y;
        this.f9093d.moveTo(floatValue, floatValue2);
        pointF.set(floatValue, floatValue2);
    }

    public final void d(Number number, Number number2, Number number3, Number number4, Number number5, Number number6) {
        PointF pointF = this.f9096g;
        float floatValue = number.floatValue() + pointF.x;
        float floatValue2 = number2.floatValue() + pointF.y;
        float floatValue3 = number3.floatValue() + floatValue;
        float floatValue4 = number4.floatValue() + floatValue2;
        float floatValue5 = number5.floatValue() + floatValue3;
        float floatValue6 = number6.floatValue() + floatValue4;
        if (this.f9093d.isEmpty()) {
            Log.w(StubApp.getString2(948), StubApp.getString2(8140) + this.f9091b + StubApp.getString2(8126) + this.f9092c);
            this.f9093d.moveTo(floatValue5, floatValue6);
        } else {
            this.f9093d.cubicTo(floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6);
        }
        pointF.set(floatValue5, floatValue6);
    }

    public final String toString() {
        return this.j.toString().replace(StubApp.getString2(4851), StubApp.getString2(3692)).replace(StubApp.getString2(321), StubApp.getString2(397));
    }
}
