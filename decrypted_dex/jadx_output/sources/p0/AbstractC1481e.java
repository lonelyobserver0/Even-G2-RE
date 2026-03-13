package p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: p0.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1481e implements InterfaceC1480d {

    /* renamed from: b, reason: collision with root package name */
    public C1478b f19612b;

    /* renamed from: c, reason: collision with root package name */
    public C1478b f19613c;

    /* renamed from: d, reason: collision with root package name */
    public C1478b f19614d;

    /* renamed from: e, reason: collision with root package name */
    public C1478b f19615e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f19616f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f19617g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19618h;

    public AbstractC1481e() {
        ByteBuffer byteBuffer = InterfaceC1480d.f19611a;
        this.f19616f = byteBuffer;
        this.f19617g = byteBuffer;
        C1478b c1478b = C1478b.f19606e;
        this.f19614d = c1478b;
        this.f19615e = c1478b;
        this.f19612b = c1478b;
        this.f19613c = c1478b;
    }

    @Override // p0.InterfaceC1480d
    public boolean a() {
        return this.f19615e != C1478b.f19606e;
    }

    @Override // p0.InterfaceC1480d
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f19617g;
        this.f19617g = InterfaceC1480d.f19611a;
        return byteBuffer;
    }

    @Override // p0.InterfaceC1480d
    public final C1478b d(C1478b c1478b) {
        this.f19614d = c1478b;
        this.f19615e = g(c1478b);
        return a() ? this.f19615e : C1478b.f19606e;
    }

    @Override // p0.InterfaceC1480d
    public final void e() {
        this.f19618h = true;
        i();
    }

    @Override // p0.InterfaceC1480d
    public boolean f() {
        return this.f19618h && this.f19617g == InterfaceC1480d.f19611a;
    }

    @Override // p0.InterfaceC1480d
    public final void flush() {
        this.f19617g = InterfaceC1480d.f19611a;
        this.f19618h = false;
        this.f19612b = this.f19614d;
        this.f19613c = this.f19615e;
        h();
    }

    public abstract C1478b g(C1478b c1478b);

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public final ByteBuffer k(int i3) {
        if (this.f19616f.capacity() < i3) {
            this.f19616f = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.f19616f.clear();
        }
        ByteBuffer byteBuffer = this.f19616f;
        this.f19617g = byteBuffer;
        return byteBuffer;
    }

    @Override // p0.InterfaceC1480d
    public final void reset() {
        flush();
        this.f19616f = InterfaceC1480d.f19611a;
        C1478b c1478b = C1478b.f19606e;
        this.f19614d = c1478b;
        this.f19615e = c1478b;
        this.f19612b = c1478b;
        this.f19613c = c1478b;
        j();
    }
}
