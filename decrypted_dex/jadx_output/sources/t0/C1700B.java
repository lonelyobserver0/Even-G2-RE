package t0;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: t0.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1700B extends AbstractC1703c {

    /* renamed from: e, reason: collision with root package name */
    public final int f21044e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f21045f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f21046g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f21047h;
    public DatagramSocket j;

    /* renamed from: k, reason: collision with root package name */
    public MulticastSocket f21048k;

    /* renamed from: l, reason: collision with root package name */
    public InetAddress f21049l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21050m;

    /* renamed from: n, reason: collision with root package name */
    public int f21051n;

    public C1700B(int i3) {
        super(true);
        this.f21044e = i3;
        byte[] bArr = new byte[2000];
        this.f21045f = bArr;
        this.f21046g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        this.f21047h = null;
        MulticastSocket multicastSocket = this.f21048k;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f21049l;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f21048k = null;
        }
        DatagramSocket datagramSocket = this.j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.j = null;
        }
        this.f21049l = null;
        this.f21051n = 0;
        if (this.f21050m) {
            this.f21050m = false;
            d();
        }
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        Uri uri = c1711k.f21077a;
        this.f21047h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f21047h.getPort();
        g();
        try {
            this.f21049l = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f21049l, port);
            if (this.f21049l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f21048k = multicastSocket;
                multicastSocket.joinGroup(this.f21049l);
                this.j = this.f21048k;
            } else {
                this.j = new DatagramSocket(inetSocketAddress);
            }
            this.j.setSoTimeout(this.f21044e);
            this.f21050m = true;
            j(c1711k);
            return -1L;
        } catch (IOException e10) {
            throw new C1699A(2001, e10);
        } catch (SecurityException e11) {
            throw new C1699A(2006, e11);
        }
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f21051n;
        DatagramPacket datagramPacket = this.f21046g;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.j;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f21051n = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new C1699A(2002, e10);
            } catch (IOException e11) {
                throw new C1699A(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f21051n;
        int min = Math.min(i12, i10);
        System.arraycopy(this.f21045f, length2 - i12, bArr, i3, min);
        this.f21051n -= min;
        return min;
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f21047h;
    }
}
