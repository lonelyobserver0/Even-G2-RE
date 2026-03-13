package b0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.stub.StubApp;
import i2.u;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.UByte;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0481h {

    /* renamed from: U, reason: collision with root package name */
    public static final C0478e f10441U;

    /* renamed from: V, reason: collision with root package name */
    public static final C0478e[][] f10442V;

    /* renamed from: W, reason: collision with root package name */
    public static final C0478e[] f10443W;

    /* renamed from: X, reason: collision with root package name */
    public static final HashMap[] f10444X;

    /* renamed from: Y, reason: collision with root package name */
    public static final HashMap[] f10445Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final HashSet f10446Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashMap f10447a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final Charset f10448b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f10449c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f10450d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f10451e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f10452f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f10453g0;

    /* renamed from: a, reason: collision with root package name */
    public final String f10461a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f10462b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f10463c;

    /* renamed from: d, reason: collision with root package name */
    public int f10464d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap[] f10465e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f10466f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f10467g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10468h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10469i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public int f10470k;

    /* renamed from: l, reason: collision with root package name */
    public int f10471l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f10472m;

    /* renamed from: n, reason: collision with root package name */
    public int f10473n;

    /* renamed from: o, reason: collision with root package name */
    public int f10474o;

    /* renamed from: p, reason: collision with root package name */
    public int f10475p;

    /* renamed from: q, reason: collision with root package name */
    public int f10476q;

    /* renamed from: r, reason: collision with root package name */
    public int f10477r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10478s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f10454t = Log.isLoggable(StubApp.getString2(8612), 3);

    /* renamed from: u, reason: collision with root package name */
    public static final List f10455u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final List f10456v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f10457w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f10458x = {8};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f10459y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f10460z = {102, 116, 121, 112};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f10421A = {109, 105, 102, 49};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f10422B = {104, 101, 105, 99};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f10423C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f10424D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f10425E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f10426F = {101, 88, 73, 102};

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f10427G = {73, 72, 68, 82};

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f10428H = {73, 69, 78, 68};

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f10429I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f10430J = {87, 69, 66, 80};

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f10431K = {69, 88, 73, 70};

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f10432L = {-99, 1, 42};

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f10433M = StubApp.getString2(8628).getBytes(Charset.defaultCharset());

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f10434N = StubApp.getString2(8629).getBytes(Charset.defaultCharset());

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f10435O = StubApp.getString2(8630).getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f10436P = StubApp.getString2(8631).getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f10437Q = StubApp.getString2(8632).getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    public static final String[] f10438R = {"", StubApp.getString2(8635), StubApp.getString2(3793), StubApp.getString2(8636), StubApp.getString2(8637), StubApp.getString2(8638), StubApp.getString2(8639), StubApp.getString2(8640), StubApp.getString2(8641), StubApp.getString2(8642), StubApp.getString2(8633), StubApp.getString2(8634), StubApp.getString2(8643), StubApp.getString2(8644)};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f10439S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: T, reason: collision with root package name */
    public static final byte[] f10440T = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        String string2 = StubApp.getString2(8645);
        C0478e c0478e = new C0478e(string2, 254, 4);
        String string22 = StubApp.getString2(8646);
        C0478e c0478e2 = new C0478e(string22, 255, 4);
        C0478e c0478e3 = new C0478e(StubApp.getString2(3844), 256, 3, 4);
        C0478e c0478e4 = new C0478e(StubApp.getString2(3845), 257, 3, 4);
        String string23 = StubApp.getString2(8647);
        C0478e c0478e5 = new C0478e(string23, 258, 3);
        String string24 = StubApp.getString2(8648);
        C0478e c0478e6 = new C0478e(string24, 259, 3);
        String string25 = StubApp.getString2(8649);
        C0478e c0478e7 = new C0478e(string25, 262, 3);
        String string26 = StubApp.getString2(8650);
        C0478e c0478e8 = new C0478e(string26, 270, 2);
        String string27 = StubApp.getString2(3840);
        C0478e c0478e9 = new C0478e(string27, 271, 2);
        String string28 = StubApp.getString2(3841);
        C0478e c0478e10 = new C0478e(string28, 272, 2);
        String string29 = StubApp.getString2(8651);
        C0478e c0478e11 = new C0478e(string29, 273, 3, 4);
        C0478e c0478e12 = new C0478e(StubApp.getString2(3846), 274, 3);
        C0478e c0478e13 = new C0478e(StubApp.getString2(8652), 277, 3);
        C0478e c0478e14 = new C0478e(StubApp.getString2(8653), 278, 3, 4);
        C0478e c0478e15 = new C0478e(StubApp.getString2(8654), 279, 3, 4);
        C0478e c0478e16 = new C0478e(StubApp.getString2(8655), 282, 5);
        C0478e c0478e17 = new C0478e(StubApp.getString2(8656), DfuBaseService.NOTIFICATION_ID, 5);
        C0478e c0478e18 = new C0478e(StubApp.getString2(8657), 284, 3);
        C0478e c0478e19 = new C0478e(StubApp.getString2(8658), 296, 3);
        C0478e c0478e20 = new C0478e(StubApp.getString2(8659), 301, 3);
        C0478e c0478e21 = new C0478e(StubApp.getString2(8660), 305, 2);
        C0478e c0478e22 = new C0478e(StubApp.getString2(3825), 306, 2);
        C0478e c0478e23 = new C0478e(StubApp.getString2(8661), 315, 2);
        C0478e c0478e24 = new C0478e(StubApp.getString2(8662), 318, 5);
        C0478e c0478e25 = new C0478e(StubApp.getString2(8663), 319, 5);
        String string210 = StubApp.getString2(8664);
        C0478e c0478e26 = new C0478e(string210, 330, 4);
        C0478e c0478e27 = new C0478e(StubApp.getString2(8665), 513, 4);
        C0478e c0478e28 = new C0478e(StubApp.getString2(8666), 514, 4);
        C0478e c0478e29 = new C0478e(StubApp.getString2(8667), 529, 5);
        C0478e c0478e30 = new C0478e(StubApp.getString2(8668), 530, 3);
        C0478e c0478e31 = new C0478e(StubApp.getString2(8669), 531, 3);
        C0478e c0478e32 = new C0478e(StubApp.getString2(8670), 532, 5);
        C0478e c0478e33 = new C0478e(StubApp.getString2(7715), 33432, 2);
        String string211 = StubApp.getString2(8671);
        C0478e c0478e34 = new C0478e(string211, 34665, 4);
        String string212 = StubApp.getString2(8672);
        C0478e[] c0478eArr = {c0478e, c0478e2, c0478e3, c0478e4, c0478e5, c0478e6, c0478e7, c0478e8, c0478e9, c0478e10, c0478e11, c0478e12, c0478e13, c0478e14, c0478e15, c0478e16, c0478e17, c0478e18, c0478e19, c0478e20, c0478e21, c0478e22, c0478e23, c0478e24, c0478e25, c0478e26, c0478e27, c0478e28, c0478e29, c0478e30, c0478e31, c0478e32, c0478e33, c0478e34, new C0478e(string212, 34853, 4), new C0478e(StubApp.getString2(8673), 4, 4), new C0478e(StubApp.getString2(8674), 5, 4), new C0478e(StubApp.getString2(8675), 6, 4), new C0478e(StubApp.getString2(8676), 7, 4), new C0478e(StubApp.getString2(8677), 23, 3), new C0478e(StubApp.getString2(8678), 46, 7), new C0478e(StubApp.getString2(8679), 700, 1)};
        C0478e[] c0478eArr2 = {new C0478e(StubApp.getString2(3827), 33434, 5), new C0478e(StubApp.getString2(3824), 33437, 5), new C0478e(StubApp.getString2(8680), 34850, 3), new C0478e(StubApp.getString2(8681), 34852, 2), new C0478e(StubApp.getString2(3839), 34855, 3), new C0478e(StubApp.getString2(8682), 34856, 7), new C0478e(StubApp.getString2(8683), 34864, 3), new C0478e(StubApp.getString2(8684), 34865, 4), new C0478e(StubApp.getString2(8685), 34866, 4), new C0478e(StubApp.getString2(8686), 34867, 4), new C0478e(StubApp.getString2(8687), 34868, 4), new C0478e(StubApp.getString2(8688), 34869, 4), new C0478e(StubApp.getString2(8689), 36864, 2), new C0478e(StubApp.getString2(8690), 36867, 2), new C0478e(StubApp.getString2(3826), 36868, 2), new C0478e(StubApp.getString2(8691), 36880, 2), new C0478e(StubApp.getString2(8692), 36881, 2), new C0478e(StubApp.getString2(8693), 36882, 2), new C0478e(StubApp.getString2(8694), 37121, 7), new C0478e(StubApp.getString2(8695), 37122, 5), new C0478e(StubApp.getString2(8696), 37377, 10), new C0478e(StubApp.getString2(8697), 37378, 5), new C0478e(StubApp.getString2(8698), 37379, 10), new C0478e(StubApp.getString2(8699), 37380, 10), new C0478e(StubApp.getString2(8700), 37381, 5), new C0478e(StubApp.getString2(8701), 37382, 5), new C0478e(StubApp.getString2(8702), 37383, 3), new C0478e(StubApp.getString2(8703), 37384, 3), new C0478e(StubApp.getString2(3828), 37385, 3), new C0478e(StubApp.getString2(3829), 37386, 5), new C0478e(StubApp.getString2(8704), 37396, 3), new C0478e(StubApp.getString2(8705), 37500, 7), new C0478e(StubApp.getString2(8706), 37510, 7), new C0478e(StubApp.getString2(3822), 37520, 2), new C0478e(StubApp.getString2(3842), 37521, 2), new C0478e(StubApp.getString2(3823), 37522, 2), new C0478e(StubApp.getString2(8707), 40960, 7), new C0478e(StubApp.getString2(8708), 40961, 3), new C0478e(StubApp.getString2(8709), 40962, 3, 4), new C0478e(StubApp.getString2(8710), 40963, 3, 4), new C0478e(StubApp.getString2(8711), 40964, 2), new C0478e(StubApp.getString2(8712), 40965, 4), new C0478e(StubApp.getString2(8713), 41483, 5), new C0478e(StubApp.getString2(8714), 41484, 7), new C0478e(StubApp.getString2(8715), 41486, 5), new C0478e(StubApp.getString2(8716), 41487, 5), new C0478e(StubApp.getString2(8717), 41488, 3), new C0478e(StubApp.getString2(8718), 41492, 3), new C0478e(StubApp.getString2(8719), 41493, 5), new C0478e(StubApp.getString2(8720), 41495, 3), new C0478e(StubApp.getString2(8721), 41728, 7), new C0478e(StubApp.getString2(8722), 41729, 7), new C0478e(StubApp.getString2(8723), 41730, 7), new C0478e(StubApp.getString2(8724), 41985, 3), new C0478e(StubApp.getString2(8725), 41986, 3), new C0478e(StubApp.getString2(3843), 41987, 3), new C0478e(StubApp.getString2(8726), 41988, 5), new C0478e(StubApp.getString2(8727), 41989, 3), new C0478e(StubApp.getString2(8728), 41990, 3), new C0478e(StubApp.getString2(8729), 41991, 3), new C0478e(StubApp.getString2(8730), 41992, 3), new C0478e(StubApp.getString2(8731), 41993, 3), new C0478e(StubApp.getString2(8732), 41994, 3), new C0478e(StubApp.getString2(8733), 41995, 7), new C0478e(StubApp.getString2(8734), 41996, 3), new C0478e(StubApp.getString2(8735), 42016, 2), new C0478e(StubApp.getString2(8736), 42032, 2), new C0478e(StubApp.getString2(8737), 42033, 2), new C0478e(StubApp.getString2(8738), 42034, 5), new C0478e(StubApp.getString2(8739), 42035, 2), new C0478e(StubApp.getString2(8740), 42036, 2), new C0478e(StubApp.getString2(8741), 42240, 5), new C0478e(StubApp.getString2(8742), 50706, 1), new C0478e(StubApp.getString2(8743), 50720, 3, 4)};
        C0478e[] c0478eArr3 = {new C0478e(StubApp.getString2(8744), 0, 1), new C0478e(StubApp.getString2(3834), 1, 2), new C0478e(StubApp.getString2(3833), 2, 5, 10), new C0478e(StubApp.getString2(3836), 3, 2), new C0478e(StubApp.getString2(3835), 4, 5, 10), new C0478e(StubApp.getString2(3831), 5, 1), new C0478e(StubApp.getString2(3830), 6, 5), new C0478e(StubApp.getString2(3838), 7, 5), new C0478e(StubApp.getString2(8745), 8, 2), new C0478e(StubApp.getString2(8746), 9, 2), new C0478e(StubApp.getString2(8747), 10, 2), new C0478e(StubApp.getString2(8748), 11, 5), new C0478e(StubApp.getString2(8749), 12, 2), new C0478e(StubApp.getString2(8750), 13, 5), new C0478e(StubApp.getString2(8751), 14, 2), new C0478e(StubApp.getString2(8752), 15, 5), new C0478e(StubApp.getString2(8753), 16, 2), new C0478e(StubApp.getString2(8754), 17, 5), new C0478e(StubApp.getString2(8755), 18, 2), new C0478e(StubApp.getString2(8756), 19, 2), new C0478e(StubApp.getString2(8757), 20, 5), new C0478e(StubApp.getString2(8758), 21, 2), new C0478e(StubApp.getString2(8759), 22, 5), new C0478e(StubApp.getString2(8760), 23, 2), new C0478e(StubApp.getString2(8761), 24, 5), new C0478e(StubApp.getString2(8762), 25, 2), new C0478e(StubApp.getString2(8763), 26, 5), new C0478e(StubApp.getString2(3837), 27, 7), new C0478e(StubApp.getString2(8764), 28, 7), new C0478e(StubApp.getString2(3832), 29, 2), new C0478e(StubApp.getString2(8765), 30, 3), new C0478e(StubApp.getString2(8766), 31, 5)};
        C0478e[] c0478eArr4 = {new C0478e(StubApp.getString2(8767), 1, 2)};
        C0478e[] c0478eArr5 = {new C0478e(string2, 254, 4), new C0478e(string22, 255, 4), new C0478e(StubApp.getString2(8768), 256, 3, 4), new C0478e(StubApp.getString2(8769), 257, 3, 4), new C0478e(string23, 258, 3), new C0478e(string24, 259, 3), new C0478e(string25, 262, 3), new C0478e(string26, 270, 2), new C0478e(string27, 271, 2), new C0478e(string28, 272, 2), new C0478e(string29, 273, 3, 4), new C0478e(StubApp.getString2(8770), 274, 3), new C0478e(StubApp.getString2(8652), 277, 3), new C0478e(StubApp.getString2(8653), 278, 3, 4), new C0478e(StubApp.getString2(8654), 279, 3, 4), new C0478e(StubApp.getString2(8655), 282, 5), new C0478e(StubApp.getString2(8656), DfuBaseService.NOTIFICATION_ID, 5), new C0478e(StubApp.getString2(8657), 284, 3), new C0478e(StubApp.getString2(8658), 296, 3), new C0478e(StubApp.getString2(8659), 301, 3), new C0478e(StubApp.getString2(8660), 305, 2), new C0478e(StubApp.getString2(3825), 306, 2), new C0478e(StubApp.getString2(8661), 315, 2), new C0478e(StubApp.getString2(8662), 318, 5), new C0478e(StubApp.getString2(8663), 319, 5), new C0478e(string210, 330, 4), new C0478e(StubApp.getString2(8665), 513, 4), new C0478e(StubApp.getString2(8666), 514, 4), new C0478e(StubApp.getString2(8667), 529, 5), new C0478e(StubApp.getString2(8668), 530, 3), new C0478e(StubApp.getString2(8669), 531, 3), new C0478e(StubApp.getString2(8670), 532, 5), new C0478e(StubApp.getString2(7715), 33432, 2), new C0478e(string211, 34665, 4), new C0478e(string212, 34853, 4), new C0478e(StubApp.getString2(8742), 50706, 1), new C0478e(StubApp.getString2(8743), 50720, 3, 4)};
        f10441U = new C0478e(string29, 273, 3);
        f10442V = new C0478e[][]{c0478eArr, c0478eArr2, c0478eArr3, c0478eArr4, c0478eArr5, c0478eArr, new C0478e[]{new C0478e(StubApp.getString2(8771), 256, 7), new C0478e(StubApp.getString2(8772), 8224, 4), new C0478e(StubApp.getString2(8773), 8256, 4)}, new C0478e[]{new C0478e(StubApp.getString2(8774), 257, 4), new C0478e(StubApp.getString2(8775), 258, 4)}, new C0478e[]{new C0478e(StubApp.getString2(8776), 4371, 3)}, new C0478e[]{new C0478e(StubApp.getString2(8708), 55, 3)}};
        f10443W = new C0478e[]{new C0478e(string210, 330, 4), new C0478e(string211, 34665, 4), new C0478e(string212, 34853, 4), new C0478e(StubApp.getString2(8712), 40965, 4), new C0478e(StubApp.getString2(8772), 8224, 1), new C0478e(StubApp.getString2(8773), 8256, 1)};
        f10444X = new HashMap[10];
        f10445Y = new HashMap[10];
        f10446Z = new HashSet(Arrays.asList(StubApp.getString2(3824), StubApp.getString2(8726), StubApp.getString2(3827), StubApp.getString2(8701), StubApp.getString2(3838)));
        f10447a0 = new HashMap();
        Charset forName = Charset.forName(StubApp.getString2(2879));
        f10448b0 = forName;
        f10449c0 = StubApp.getString2(3821).getBytes(forName);
        f10450d0 = StubApp.getString2(8777).getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat(StubApp.getString2(8778), locale).setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
        new SimpleDateFormat(StubApp.getString2(8780), locale).setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
        int i3 = 0;
        while (true) {
            C0478e[][] c0478eArr6 = f10442V;
            if (i3 >= c0478eArr6.length) {
                HashMap hashMap = f10447a0;
                C0478e[] c0478eArr7 = f10443W;
                hashMap.put(Integer.valueOf(c0478eArr7[0].f10415a), 5);
                hashMap.put(Integer.valueOf(c0478eArr7[1].f10415a), 1);
                hashMap.put(Integer.valueOf(c0478eArr7[2].f10415a), 2);
                hashMap.put(Integer.valueOf(c0478eArr7[3].f10415a), 3);
                hashMap.put(Integer.valueOf(c0478eArr7[4].f10415a), 7);
                hashMap.put(Integer.valueOf(c0478eArr7[5].f10415a), 8);
                Pattern.compile(StubApp.getString2(8781));
                f10451e0 = Pattern.compile(StubApp.getString2(8782));
                f10452f0 = Pattern.compile(StubApp.getString2(8783));
                f10453g0 = Pattern.compile(StubApp.getString2(8784));
                return;
            }
            f10444X[i3] = new HashMap();
            f10445Y[i3] = new HashMap();
            for (C0478e c0478e35 : c0478eArr6[i3]) {
                f10444X[i3].put(Integer.valueOf(c0478e35.f10415a), c0478e35);
                f10445Y[i3].put(c0478e35.f10416b, c0478e35);
            }
            i3++;
        }
    }

    public C0481h(String str) {
        C0478e[][] c0478eArr = f10442V;
        this.f10465e = new HashMap[c0478eArr.length];
        this.f10466f = new HashSet(c0478eArr.length);
        this.f10467g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(8788));
        }
        FileInputStream fileInputStream = null;
        this.f10463c = null;
        this.f10461a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (p(fileInputStream2.getFD())) {
                    this.f10462b = fileInputStream2.getFD();
                } else {
                    this.f10462b = null;
                }
                r(fileInputStream2);
                hc.b.p(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                hc.b.p(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Pair n(String str) {
        String string2 = StubApp.getString2(321);
        if (str.contains(string2)) {
            String[] split = str.split(string2, -1);
            Pair n10 = n(split[0]);
            if (((Integer) n10.first).intValue() == 2) {
                return n10;
            }
            for (int i3 = 1; i3 < split.length; i3++) {
                Pair n11 = n(split[i3]);
                int intValue = (((Integer) n11.first).equals(n10.first) || ((Integer) n11.second).equals(n10.first)) ? ((Integer) n10.first).intValue() : -1;
                int intValue2 = (((Integer) n10.second).intValue() == -1 || !(((Integer) n11.first).equals(n10.second) || ((Integer) n11.second).equals(n10.second))) ? -1 : ((Integer) n10.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    n10 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    n10 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return n10;
        }
        String string22 = StubApp.getString2(601);
        if (!str.contains(string22)) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split(string22, -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static boolean p(FileDescriptor fileDescriptor) {
        try {
            AbstractC0482i.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f10454t) {
                return false;
            }
            Log.d(StubApp.getString2(8612), StubApp.getString2(8789));
            return false;
        }
    }

    public static ByteOrder u(C0475b c0475b) {
        short readShort = c0475b.readShort();
        String string2 = StubApp.getString2(8612);
        boolean z2 = f10454t;
        if (readShort == 18761) {
            if (z2) {
                Log.d(string2, StubApp.getString2(8791));
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z2) {
                Log.d(string2, StubApp.getString2(8790));
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(StubApp.getString2(8611) + Integer.toHexString(readShort));
    }

    public final void A(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8792) + bufferedInputStream + StubApp.getString2(8793) + bufferedOutputStream + StubApp.getString2(74));
        }
        C0475b c0475b = new C0475b(bufferedInputStream);
        C0476c c0476c = new C0476c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        byte readByte = c0475b.readByte();
        String string2 = StubApp.getString2(8794);
        if (readByte != -1) {
            throw new IOException(string2);
        }
        c0476c.a(-1);
        if (c0475b.readByte() != -40) {
            throw new IOException(string2);
        }
        c0476c.a(-40);
        String string22 = StubApp.getString2(8679);
        String b2 = b(string22);
        HashMap[] hashMapArr = this.f10465e;
        C0477d c0477d = (b2 == null || !this.f10478s) ? null : (C0477d) hashMapArr[0].remove(string22);
        c0476c.a(-1);
        c0476c.a(-31);
        I(c0476c);
        if (c0477d != null) {
            hashMapArr[0].put(string22, c0477d);
        }
        byte[] bArr = new byte[4096];
        while (c0475b.readByte() == -1) {
            byte readByte2 = c0475b.readByte();
            if (readByte2 == -39 || readByte2 == -38) {
                c0476c.a(-1);
                c0476c.a(readByte2);
                hc.b.s(c0475b, c0476c);
                return;
            }
            String string23 = StubApp.getString2(8795);
            if (readByte2 != -31) {
                c0476c.a(-1);
                c0476c.a(readByte2);
                int readUnsignedShort = c0475b.readUnsignedShort();
                c0476c.k(readUnsignedShort);
                int i3 = readUnsignedShort - 2;
                if (i3 < 0) {
                    throw new IOException(string23);
                }
                while (i3 > 0) {
                    int read = c0475b.read(bArr, 0, Math.min(i3, 4096));
                    if (read >= 0) {
                        c0476c.write(bArr, 0, read);
                        i3 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = c0475b.readUnsignedShort();
                int i10 = readUnsignedShort2 - 2;
                if (i10 < 0) {
                    throw new IOException(string23);
                }
                byte[] bArr2 = new byte[6];
                if (i10 >= 6) {
                    c0475b.readFully(bArr2);
                    if (Arrays.equals(bArr2, f10449c0)) {
                        c0475b.a(readUnsignedShort2 - 8);
                    }
                }
                c0476c.a(-1);
                c0476c.a(readByte2);
                c0476c.k(readUnsignedShort2);
                if (i10 >= 6) {
                    i10 = readUnsignedShort2 - 8;
                    c0476c.write(bArr2);
                }
                while (i10 > 0) {
                    int read2 = c0475b.read(bArr, 0, Math.min(i10, 4096));
                    if (read2 >= 0) {
                        c0476c.write(bArr, 0, read2);
                        i10 -= read2;
                    }
                }
            }
        }
        throw new IOException(string2);
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8796) + bufferedInputStream + StubApp.getString2(8793) + bufferedOutputStream + StubApp.getString2(74));
        }
        C0475b c0475b = new C0475b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C0476c c0476c = new C0476c(bufferedOutputStream, byteOrder);
        hc.b.r(c0475b, c0476c, f10425E.length);
        if (this.f10474o == 0) {
            int readInt = c0475b.readInt();
            c0476c.d(readInt);
            hc.b.r(c0475b, c0476c, readInt + 8);
        } else {
            hc.b.r(c0475b, c0476c, (r2 - r7.length) - 8);
            c0475b.a(c0475b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C0476c c0476c2 = new C0476c(byteArrayOutputStream, byteOrder);
            I(c0476c2);
            byte[] byteArray = ((ByteArrayOutputStream) c0476c2.f10409a).toByteArray();
            c0476c.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c0476c.d((int) crc32.getValue());
            hc.b.p(byteArrayOutputStream);
            hc.b.s(c0475b, c0476c);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            hc.b.p(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i3;
        int i10;
        int i11;
        int i12;
        ByteArrayOutputStream byteArrayOutputStream2;
        C0476c c0476c;
        byte[] bArr;
        boolean z2;
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8797) + bufferedInputStream + StubApp.getString2(8793) + bufferedOutputStream + StubApp.getString2(74));
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C0475b c0475b = new C0475b(bufferedInputStream, byteOrder);
        C0476c c0476c2 = new C0476c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = f10429I;
        hc.b.r(c0475b, c0476c2, bArr2.length);
        byte[] bArr3 = f10430J;
        c0475b.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    C0476c c0476c3 = new C0476c(byteArrayOutputStream4, byteOrder);
                    int i13 = this.f10474o;
                    try {
                    } catch (Exception e10) {
                        e = e10;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    }
                    try {
                        if (i13 != 0) {
                            hc.b.r(c0475b, c0476c3, (i13 - ((bArr2.length + 4) + bArr3.length)) - 8);
                            c0475b.a(4);
                            int readInt = c0475b.readInt();
                            if (readInt % 2 != 0) {
                                readInt++;
                            }
                            c0475b.a(readInt);
                            I(c0476c3);
                        } else {
                            byte[] bArr4 = new byte[4];
                            c0475b.readFully(bArr4);
                            byte[] bArr5 = f10433M;
                            boolean equals = Arrays.equals(bArr4, bArr5);
                            byte[] bArr6 = f10435O;
                            byte[] bArr7 = f10434N;
                            if (equals) {
                                int readInt2 = c0475b.readInt();
                                byte[] bArr8 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                                c0475b.readFully(bArr8);
                                byte b2 = (byte) (8 | bArr8[0]);
                                bArr8[0] = b2;
                                boolean z10 = ((b2 >> 1) & 1) == 1;
                                c0476c3.write(bArr5);
                                c0476c3.d(readInt2);
                                c0476c3.write(bArr8);
                                if (z10) {
                                    byte[] bArr9 = f10436P;
                                    do {
                                        bArr = new byte[4];
                                        c0475b.readFully(bArr);
                                        int readInt3 = c0475b.readInt();
                                        c0476c3.write(bArr);
                                        c0476c3.d(readInt3);
                                        if (readInt3 % 2 == 1) {
                                            readInt3++;
                                        }
                                        hc.b.r(c0475b, c0476c3, readInt3);
                                    } while (!Arrays.equals(bArr, bArr9));
                                    while (true) {
                                        byte[] bArr10 = new byte[4];
                                        try {
                                            c0475b.readFully(bArr10);
                                            z2 = !Arrays.equals(bArr10, f10437Q);
                                        } catch (EOFException unused) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            break;
                                        }
                                        int readInt4 = c0475b.readInt();
                                        c0476c3.write(bArr10);
                                        c0476c3.d(readInt4);
                                        if (readInt4 % 2 == 1) {
                                            readInt4++;
                                        }
                                        hc.b.r(c0475b, c0476c3, readInt4);
                                    }
                                    I(c0476c3);
                                } else {
                                    while (true) {
                                        byte[] bArr11 = new byte[4];
                                        c0475b.readFully(bArr11);
                                        int readInt5 = c0475b.readInt();
                                        c0476c3.write(bArr11);
                                        c0476c3.d(readInt5);
                                        if (readInt5 % 2 == 1) {
                                            readInt5++;
                                        }
                                        hc.b.r(c0475b, c0476c3, readInt5);
                                        if (Arrays.equals(bArr11, bArr6) || (bArr7 != null && Arrays.equals(bArr11, bArr7))) {
                                            break;
                                        }
                                    }
                                    I(c0476c3);
                                }
                            } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                int readInt6 = c0475b.readInt();
                                int i14 = readInt6 % 2 == 1 ? readInt6 + 1 : readInt6;
                                byte[] bArr12 = new byte[3];
                                boolean equals2 = Arrays.equals(bArr4, bArr6);
                                boolean z11 = true;
                                byte[] bArr13 = f10432L;
                                if (equals2) {
                                    c0475b.readFully(bArr12);
                                    byte[] bArr14 = new byte[3];
                                    c0475b.readFully(bArr14);
                                    if (!Arrays.equals(bArr13, bArr14)) {
                                        throw new IOException(StubApp.getString2("8798"));
                                    }
                                    i3 = c0475b.readInt();
                                    i14 -= 10;
                                    i10 = (i3 << 18) >> 18;
                                    i11 = (i3 << 2) >> 18;
                                    z11 = false;
                                } else if (!Arrays.equals(bArr4, bArr7)) {
                                    i3 = 0;
                                    i10 = 0;
                                    z11 = false;
                                    i11 = 0;
                                } else {
                                    if (c0475b.readByte() != 47) {
                                        throw new IOException(StubApp.getString2("8799"));
                                    }
                                    i3 = c0475b.readInt();
                                    i10 = (i3 & 16383) + 1;
                                    i11 = ((i3 & 268419072) >>> 14) + 1;
                                    if ((i3 & 268435456) == 0) {
                                        z11 = false;
                                    }
                                    i14 -= 5;
                                }
                                c0476c3.write(bArr5);
                                c0476c3.d(10);
                                byte[] bArr15 = new byte[10];
                                if (z11) {
                                    i12 = i10;
                                    bArr15[0] = (byte) (bArr15[0] | Tnaf.POW_2_WIDTH);
                                } else {
                                    i12 = i10;
                                }
                                bArr15[0] = (byte) (bArr15[0] | 8);
                                int i15 = i12 - 1;
                                byteArrayOutputStream2 = byteArrayOutputStream4;
                                int i16 = i11 - 1;
                                c0476c = c0476c2;
                                try {
                                    bArr15[4] = (byte) i15;
                                    bArr15[5] = (byte) (i15 >> 8);
                                    bArr15[6] = (byte) (i15 >> 16);
                                    bArr15[7] = (byte) i16;
                                    bArr15[8] = (byte) (i16 >> 8);
                                    bArr15[9] = (byte) (i16 >> 16);
                                    c0476c3.write(bArr15);
                                    c0476c3.write(bArr4);
                                    c0476c3.d(readInt6);
                                    try {
                                        if (!Arrays.equals(bArr4, bArr6)) {
                                            if (Arrays.equals(bArr4, bArr7)) {
                                                c0476c3.write(47);
                                                c0476c3.d(i3);
                                            }
                                            hc.b.r(c0475b, c0476c3, i14);
                                            I(c0476c3);
                                            hc.b.s(c0475b, c0476c3);
                                            C0476c c0476c4 = c0476c;
                                            c0476c4.d(byteArrayOutputStream2.size() + bArr3.length);
                                            c0476c4.write(bArr3);
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream.writeTo(c0476c4);
                                            hc.b.p(byteArrayOutputStream);
                                            return;
                                        }
                                        c0476c3.write(bArr12);
                                        c0476c3.write(bArr13);
                                        c0476c3.d(i3);
                                        hc.b.r(c0475b, c0476c3, i14);
                                        I(c0476c3);
                                        hc.b.s(c0475b, c0476c3);
                                        C0476c c0476c42 = c0476c;
                                        c0476c42.d(byteArrayOutputStream2.size() + bArr3.length);
                                        c0476c42.write(bArr3);
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.writeTo(c0476c42);
                                        hc.b.p(byteArrayOutputStream);
                                        return;
                                    } catch (Exception e11) {
                                        e = e11;
                                        throw new IOException(StubApp.getString2("8800"), e);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream3 = byteArrayOutputStream2;
                                        hc.b.p(byteArrayOutputStream3);
                                        throw th;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    throw new IOException(StubApp.getString2("8800"), e);
                                } catch (Throwable th3) {
                                    th = th3;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    byteArrayOutputStream3 = byteArrayOutputStream;
                                    hc.b.p(byteArrayOutputStream3);
                                    throw th;
                                }
                            }
                        }
                        byteArrayOutputStream.writeTo(c0476c42);
                        hc.b.p(byteArrayOutputStream);
                        return;
                    } catch (Exception e13) {
                        e = e13;
                        throw new IOException(StubApp.getString2("8800"), e);
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream3 = byteArrayOutputStream;
                        hc.b.p(byteArrayOutputStream3);
                        throw th;
                    }
                    c0476c = c0476c2;
                    byteArrayOutputStream2 = byteArrayOutputStream4;
                    hc.b.s(c0475b, c0476c3);
                    C0476c c0476c422 = c0476c;
                    c0476c422.d(byteArrayOutputStream2.size() + bArr3.length);
                    c0476c422.write(bArr3);
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (Exception e14) {
                    e = e14;
                    byteArrayOutputStream = byteArrayOutputStream4;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = byteArrayOutputStream4;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    public final void D(String str, String str2) {
        C0478e c0478e;
        int i3;
        int i10;
        C0477d c0477d;
        int i11;
        int i12;
        String str3 = str;
        String str4 = str2;
        int i13 = 1;
        boolean equals = StubApp.getString2(3825).equals(str3);
        String string2 = StubApp.getString2(8801);
        String string22 = StubApp.getString2(8802);
        String string23 = StubApp.getString2(8612);
        if ((equals || StubApp.getString2(8690).equals(str3) || StubApp.getString2(3826).equals(str3)) && str4 != null) {
            boolean find = f10452f0.matcher(str4).find();
            boolean find2 = f10453g0.matcher(str4).find();
            if (str4.length() != 19 || (!find && !find2)) {
                Log.w(string23, string22 + str3 + string2 + str4);
                return;
            }
            if (find2) {
                str4 = str4.replaceAll(StubApp.getString2(999), StubApp.getString2(478));
            }
        }
        boolean equals2 = StubApp.getString2(8803).equals(str3);
        boolean z2 = f10454t;
        if (equals2) {
            if (z2) {
                Log.d(string23, StubApp.getString2(8804));
            }
            str3 = StubApp.getString2(3839);
        }
        int i14 = 2;
        String string24 = StubApp.getString2(601);
        if (str4 != null && f10446Z.contains(str3)) {
            if (str3.equals(StubApp.getString2(3838))) {
                Matcher matcher = f10451e0.matcher(str4);
                if (!matcher.find()) {
                    Log.w(string23, string22 + str3 + string2 + str4);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Integer.parseInt(matcher.group(1)));
                String string25 = StubApp.getString2(8805);
                sb2.append(string25);
                sb2.append(Integer.parseInt(matcher.group(2)));
                sb2.append(string25);
                sb2.append(Integer.parseInt(matcher.group(3)));
                sb2.append(StubApp.getString2(8806));
                str4 = sb2.toString();
            } else {
                try {
                    str4 = ((long) (Double.parseDouble(str4) * 10000.0d)) + string24 + 10000L;
                } catch (NumberFormatException unused) {
                    Log.w(string23, string22 + str3 + string2 + str4);
                    return;
                }
            }
        }
        int i15 = 0;
        while (i15 < f10442V.length) {
            if ((i15 != 4 || this.f10468h) && (c0478e = (C0478e) f10445Y[i15].get(str3)) != null) {
                HashMap[] hashMapArr = this.f10465e;
                if (str4 == null) {
                    hashMapArr[i15].remove(str3);
                } else {
                    Pair n10 = n(str4);
                    int intValue = ((Integer) n10.first).intValue();
                    int i16 = -1;
                    int i17 = c0478e.f10417c;
                    if (i17 != intValue && i17 != ((Integer) n10.second).intValue()) {
                        int i18 = c0478e.f10418d;
                        if (i18 != -1 && (i18 == ((Integer) n10.first).intValue() || i18 == ((Integer) n10.second).intValue())) {
                            i17 = i18;
                        } else if (i17 != i13 && i17 != 7 && i17 != i14) {
                            if (z2) {
                                StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(8807), str3, StubApp.getString2(8808));
                                String[] strArr = f10438R;
                                l9.append(strArr[i17]);
                                String string26 = StubApp.getString2(81);
                                l9.append(i18 == -1 ? "" : string26 + strArr[i18]);
                                l9.append(StubApp.getString2(8809));
                                l9.append(strArr[((Integer) n10.first).intValue()]);
                                l9.append(((Integer) n10.second).intValue() != -1 ? string26 + strArr[((Integer) n10.second).intValue()] : "");
                                l9.append(StubApp.getString2(74));
                                Log.d(string23, l9.toString());
                            }
                        }
                    }
                    int[] iArr = f10439S;
                    String string27 = StubApp.getString2(321);
                    switch (i17) {
                        case 1:
                            i3 = i15;
                            HashMap hashMap = hashMapArr[i3];
                            i10 = i13;
                            if (str4.length() != i10 || str4.charAt(0) < '0' || str4.charAt(0) > '1') {
                                byte[] bytes = str4.getBytes(f10448b0);
                                c0477d = new C0477d(i10, bytes.length, bytes);
                            } else {
                                byte[] bArr = new byte[i10];
                                bArr[0] = (byte) (str4.charAt(0) - '0');
                                c0477d = new C0477d(i10, i10, bArr);
                            }
                            hashMap.put(str3, c0477d);
                            break;
                        case 2:
                        case 7:
                            i11 = i13;
                            i3 = i15;
                            i12 = 0;
                            hashMapArr[i3].put(str3, C0477d.a(str4));
                            i10 = i11;
                            break;
                        case 3:
                            i11 = i13;
                            i3 = i15;
                            i12 = 0;
                            String[] split = str4.split(string27, -1);
                            int[] iArr2 = new int[split.length];
                            for (int i19 = 0; i19 < split.length; i19++) {
                                iArr2[i19] = Integer.parseInt(split[i19]);
                            }
                            hashMapArr[i3].put(str3, C0477d.f(iArr2, this.f10467g));
                            i10 = i11;
                            break;
                        case 4:
                            i11 = i13;
                            i3 = i15;
                            i12 = 0;
                            String[] split2 = str4.split(string27, -1);
                            long[] jArr = new long[split2.length];
                            for (int i20 = 0; i20 < split2.length; i20++) {
                                jArr[i20] = Long.parseLong(split2[i20]);
                            }
                            hashMapArr[i3].put(str3, C0477d.c(jArr, this.f10467g));
                            i10 = i11;
                            break;
                        case 5:
                            i11 = i13;
                            i3 = i15;
                            int i21 = -1;
                            i12 = 0;
                            String[] split3 = str4.split(string27, -1);
                            C0479f[] c0479fArr = new C0479f[split3.length];
                            int i22 = 0;
                            while (i22 < split3.length) {
                                String[] split4 = split3[i22].split(string24, i21);
                                c0479fArr[i22] = new C0479f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[i11]));
                                i22++;
                                i21 = -1;
                            }
                            hashMapArr[i3].put(str3, C0477d.d(c0479fArr, this.f10467g));
                            i10 = i11;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (z2) {
                                Xa.h.v(i17, StubApp.getString2(8810), string23);
                                break;
                            }
                            break;
                        case 9:
                            i11 = i13;
                            i3 = i15;
                            i12 = 0;
                            String[] split5 = str4.split(string27, -1);
                            int length = split5.length;
                            int[] iArr3 = new int[length];
                            for (int i23 = 0; i23 < split5.length; i23++) {
                                iArr3[i23] = Integer.parseInt(split5[i23]);
                            }
                            HashMap hashMap2 = hashMapArr[i3];
                            ByteOrder byteOrder = this.f10467g;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                            wrap.order(byteOrder);
                            for (int i24 = 0; i24 < length; i24++) {
                                wrap.putInt(iArr3[i24]);
                            }
                            hashMap2.put(str3, new C0477d(9, length, wrap.array()));
                            i10 = i11;
                            break;
                        case 10:
                            i11 = i13;
                            int i25 = 0;
                            String[] split6 = str4.split(string27, -1);
                            int length2 = split6.length;
                            C0479f[] c0479fArr2 = new C0479f[length2];
                            int i26 = 0;
                            while (i26 < split6.length) {
                                String[] split7 = split6[i26].split(string24, i16);
                                int i27 = i25;
                                c0479fArr2[i26] = new C0479f((long) Double.parseDouble(split7[i27]), (long) Double.parseDouble(split7[i11]));
                                i26++;
                                i25 = i27;
                                i15 = i15;
                                iArr = iArr;
                                i16 = -1;
                            }
                            int[] iArr4 = iArr;
                            i3 = i15;
                            i12 = i25;
                            HashMap hashMap3 = hashMapArr[i3];
                            ByteOrder byteOrder2 = this.f10467g;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr4[10] * length2]);
                            wrap2.order(byteOrder2);
                            for (int i28 = i12; i28 < length2; i28++) {
                                C0479f c0479f = c0479fArr2[i28];
                                wrap2.putInt((int) c0479f.f10419a);
                                wrap2.putInt((int) c0479f.f10420b);
                            }
                            hashMap3.put(str3, new C0477d(10, length2, wrap2.array()));
                            i10 = i11;
                            break;
                        case 12:
                            String[] split8 = str4.split(string27, -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i29 = 0; i29 < split8.length; i29 += i13) {
                                dArr[i29] = Double.parseDouble(split8[i29]);
                            }
                            HashMap hashMap4 = hashMapArr[i15];
                            ByteOrder byteOrder3 = this.f10467g;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                            wrap3.order(byteOrder3);
                            int i30 = 0;
                            while (i30 < length3) {
                                wrap3.putDouble(dArr[i30]);
                                i30++;
                                i13 = i13;
                            }
                            i11 = i13;
                            hashMap4.put(str3, new C0477d(12, length3, wrap3.array()));
                            i3 = i15;
                            i10 = i11;
                            break;
                    }
                    i15 = i3 + 1;
                    i13 = i10;
                    i14 = 2;
                }
            }
            i10 = i13;
            i3 = i15;
            i15 = i3 + 1;
            i13 = i10;
            i14 = 2;
        }
    }

    public final void E(C0475b c0475b) {
        String str;
        C0477d c0477d;
        int h2;
        HashMap hashMap = this.f10465e[4];
        C0477d c0477d2 = (C0477d) hashMap.get(StubApp.getString2(8648));
        if (c0477d2 == null) {
            this.f10473n = 6;
            o(c0475b, hashMap);
            return;
        }
        int h4 = c0477d2.h(this.f10467g);
        this.f10473n = h4;
        int i3 = 1;
        if (h4 != 1) {
            if (h4 == 6) {
                o(c0475b, hashMap);
                return;
            } else if (h4 != 7) {
                return;
            }
        }
        C0477d c0477d3 = (C0477d) hashMap.get(StubApp.getString2(8647));
        String string2 = StubApp.getString2(8612);
        if (c0477d3 != null) {
            int[] iArr = (int[]) c0477d3.j(this.f10467g);
            int[] iArr2 = f10457w;
            if (Arrays.equals(iArr2, iArr) || (this.f10464d == 3 && (c0477d = (C0477d) hashMap.get(StubApp.getString2(8649))) != null && (((h2 = c0477d.h(this.f10467g)) == 1 && Arrays.equals(iArr, f10458x)) || (h2 == 6 && Arrays.equals(iArr, iArr2))))) {
                String string22 = StubApp.getString2(8609);
                C0477d c0477d4 = (C0477d) hashMap.get(StubApp.getString2(8651));
                C0477d c0477d5 = (C0477d) hashMap.get(StubApp.getString2(8654));
                if (c0477d4 == null || c0477d5 == null) {
                    return;
                }
                long[] q10 = hc.b.q(c0477d4.j(this.f10467g));
                long[] q11 = hc.b.q(c0477d5.j(this.f10467g));
                if (q10 == null || q10.length == 0) {
                    Log.w(string2, StubApp.getString2(8816));
                    return;
                }
                if (q11 == null || q11.length == 0) {
                    Log.w(string2, StubApp.getString2(8815));
                    return;
                }
                if (q10.length != q11.length) {
                    Log.w(string2, StubApp.getString2(8811));
                    return;
                }
                long j = 0;
                for (long j3 : q11) {
                    j += j3;
                }
                int i10 = (int) j;
                byte[] bArr = new byte[i10];
                this.j = true;
                this.f10469i = true;
                this.f10468h = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < q10.length) {
                    int i14 = (int) q10[i11];
                    int i15 = (int) q11[i11];
                    if (i11 < q10.length - i3) {
                        str = string2;
                        if (i14 + i15 != q10[i11 + 1]) {
                            this.j = false;
                        }
                    } else {
                        str = string2;
                    }
                    int i16 = i14 - i12;
                    if (i16 < 0) {
                        Log.d(str, StubApp.getString2(8812));
                        return;
                    }
                    String str2 = str;
                    try {
                        c0475b.a(i16);
                        int i17 = i12 + i16;
                        byte[] bArr2 = new byte[i15];
                        try {
                            c0475b.readFully(bArr2);
                            i12 = i17 + i15;
                            System.arraycopy(bArr2, 0, bArr, i13, i15);
                            i13 += i15;
                            i11++;
                            string2 = str2;
                            i3 = 1;
                        } catch (EOFException unused) {
                            Log.d(str2, StubApp.getString2(8813) + i15 + string22);
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str2, StubApp.getString2(8814) + i16 + string22);
                        return;
                    }
                }
                this.f10472m = bArr;
                if (this.j) {
                    this.f10470k = (int) q10[0];
                    this.f10471l = i10;
                    return;
                }
                return;
            }
        }
        if (f10454t) {
            Log.d(string2, StubApp.getString2(8817));
        }
    }

    public final void F(int i3, int i10) {
        HashMap[] hashMapArr = this.f10465e;
        boolean isEmpty = hashMapArr[i3].isEmpty();
        String string2 = StubApp.getString2(8612);
        boolean z2 = f10454t;
        if (isEmpty || hashMapArr[i10].isEmpty()) {
            if (z2) {
                Log.d(string2, StubApp.getString2(8820));
                return;
            }
            return;
        }
        HashMap hashMap = hashMapArr[i3];
        String string22 = StubApp.getString2(3845);
        C0477d c0477d = (C0477d) hashMap.get(string22);
        HashMap hashMap2 = hashMapArr[i3];
        String string23 = StubApp.getString2(3844);
        C0477d c0477d2 = (C0477d) hashMap2.get(string23);
        C0477d c0477d3 = (C0477d) hashMapArr[i10].get(string22);
        C0477d c0477d4 = (C0477d) hashMapArr[i10].get(string23);
        if (c0477d == null || c0477d2 == null) {
            if (z2) {
                Log.d(string2, StubApp.getString2(8819));
                return;
            }
            return;
        }
        if (c0477d3 == null || c0477d4 == null) {
            if (z2) {
                Log.d(string2, StubApp.getString2(8818));
                return;
            }
            return;
        }
        int h2 = c0477d.h(this.f10467g);
        int h4 = c0477d2.h(this.f10467g);
        int h5 = c0477d3.h(this.f10467g);
        int h9 = c0477d4.h(this.f10467g);
        if (h2 >= h5 || h4 >= h9) {
            return;
        }
        HashMap hashMap3 = hashMapArr[i3];
        hashMapArr[i3] = hashMapArr[i10];
        hashMapArr[i10] = hashMap3;
    }

    public final void G(C0480g c0480g, int i3) {
        C0477d e10;
        C0477d e11;
        HashMap[] hashMapArr = this.f10465e;
        C0477d c0477d = (C0477d) hashMapArr[i3].get(StubApp.getString2(8743));
        C0477d c0477d2 = (C0477d) hashMapArr[i3].get(StubApp.getString2(8673));
        C0477d c0477d3 = (C0477d) hashMapArr[i3].get(StubApp.getString2(8674));
        C0477d c0477d4 = (C0477d) hashMapArr[i3].get(StubApp.getString2(8675));
        C0477d c0477d5 = (C0477d) hashMapArr[i3].get(StubApp.getString2(8676));
        String string2 = StubApp.getString2(3845);
        String string22 = StubApp.getString2(3844);
        if (c0477d != null) {
            int i10 = c0477d.f10411a;
            String string23 = StubApp.getString2(8821);
            String string24 = StubApp.getString2(8612);
            if (i10 == 5) {
                C0479f[] c0479fArr = (C0479f[]) c0477d.j(this.f10467g);
                if (c0479fArr == null || c0479fArr.length != 2) {
                    Log.w(string24, string23 + Arrays.toString(c0479fArr));
                    return;
                } else {
                    e10 = C0477d.d(new C0479f[]{c0479fArr[0]}, this.f10467g);
                    e11 = C0477d.d(new C0479f[]{c0479fArr[1]}, this.f10467g);
                }
            } else {
                int[] iArr = (int[]) c0477d.j(this.f10467g);
                if (iArr == null || iArr.length != 2) {
                    Log.w(string24, string23 + Arrays.toString(iArr));
                    return;
                }
                e10 = C0477d.e(iArr[0], this.f10467g);
                e11 = C0477d.e(iArr[1], this.f10467g);
            }
            hashMapArr[i3].put(string22, e10);
            hashMapArr[i3].put(string2, e11);
            return;
        }
        if (c0477d2 != null && c0477d3 != null && c0477d4 != null && c0477d5 != null) {
            int h2 = c0477d2.h(this.f10467g);
            int h4 = c0477d4.h(this.f10467g);
            int h5 = c0477d5.h(this.f10467g);
            int h9 = c0477d3.h(this.f10467g);
            if (h4 <= h2 || h5 <= h9) {
                return;
            }
            C0477d e12 = C0477d.e(h4 - h2, this.f10467g);
            C0477d e13 = C0477d.e(h5 - h9, this.f10467g);
            hashMapArr[i3].put(string2, e12);
            hashMapArr[i3].put(string22, e13);
            return;
        }
        C0477d c0477d6 = (C0477d) hashMapArr[i3].get(string2);
        C0477d c0477d7 = (C0477d) hashMapArr[i3].get(string22);
        if (c0477d6 == null || c0477d7 == null) {
            C0477d c0477d8 = (C0477d) hashMapArr[i3].get(StubApp.getString2(8665));
            C0477d c0477d9 = (C0477d) hashMapArr[i3].get(StubApp.getString2(8666));
            if (c0477d8 == null || c0477d9 == null) {
                return;
            }
            int h10 = c0477d8.h(this.f10467g);
            int h11 = c0477d8.h(this.f10467g);
            c0480g.seek(h10);
            byte[] bArr = new byte[h11];
            c0480g.readFully(bArr);
            e(new C0475b(bArr), h10, i3);
        }
    }

    public final void H() {
        F(0, 5);
        F(0, 4);
        F(5, 4);
        HashMap[] hashMapArr = this.f10465e;
        C0477d c0477d = (C0477d) hashMapArr[1].get(StubApp.getString2(8709));
        C0477d c0477d2 = (C0477d) hashMapArr[1].get(StubApp.getString2(8710));
        String string2 = StubApp.getString2(3845);
        String string22 = StubApp.getString2(3844);
        if (c0477d != null && c0477d2 != null) {
            hashMapArr[0].put(string22, c0477d);
            hashMapArr[0].put(string2, c0477d2);
        }
        if (hashMapArr[4].isEmpty() && q(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!q(hashMapArr[4])) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8822));
        }
        String string23 = StubApp.getString2(8770);
        String string24 = StubApp.getString2(3846);
        y(0, string23, string24);
        String string25 = StubApp.getString2(8769);
        y(0, string25, string2);
        String string26 = StubApp.getString2(8768);
        y(0, string26, string22);
        y(5, string23, string24);
        y(5, string25, string2);
        y(5, string26, string22);
        y(4, string24, string23);
        y(4, string2, string25);
        y(4, string22, string26);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161 A[EDGE_INSN: B:55:0x0161->B:56:0x0161 BREAK  A[LOOP:3: B:42:0x0125->B:54:0x0157], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(b0.C0476c r22) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0481h.I(b0.c):void");
    }

    public final void a() {
        String b2 = b(StubApp.getString2(8690));
        HashMap[] hashMapArr = this.f10465e;
        if (b2 != null) {
            String string2 = StubApp.getString2(3825);
            if (b(string2) == null) {
                hashMapArr[0].put(string2, C0477d.a(b2));
            }
        }
        String string22 = StubApp.getString2(3844);
        if (b(string22) == null) {
            hashMapArr[0].put(string22, C0477d.b(0L, this.f10467g));
        }
        String string23 = StubApp.getString2(3845);
        if (b(string23) == null) {
            hashMapArr[0].put(string23, C0477d.b(0L, this.f10467g));
        }
        String string24 = StubApp.getString2(3846);
        if (b(string24) == null) {
            hashMapArr[0].put(string24, C0477d.b(0L, this.f10467g));
        }
        String string25 = StubApp.getString2(8703);
        if (b(string25) == null) {
            hashMapArr[1].put(string25, C0477d.b(0L, this.f10467g));
        }
    }

    public final String b(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(8829));
        }
        C0477d c10 = c(str);
        if (c10 != null) {
            if (!f10446Z.contains(str)) {
                return c10.i(this.f10467g);
            }
            if (str.equals(StubApp.getString2(3838))) {
                String string2 = StubApp.getString2(8612);
                int i3 = c10.f10411a;
                if (i3 != 5 && i3 != 10) {
                    Log.w(string2, StubApp.getString2(8826) + i3);
                    return null;
                }
                C0479f[] c0479fArr = (C0479f[]) c10.j(this.f10467g);
                if (c0479fArr == null || c0479fArr.length != 3) {
                    Log.w(string2, StubApp.getString2(8828) + Arrays.toString(c0479fArr));
                    return null;
                }
                C0479f c0479f = c0479fArr[0];
                Integer valueOf = Integer.valueOf((int) (c0479f.f10419a / c0479f.f10420b));
                C0479f c0479f2 = c0479fArr[1];
                Integer valueOf2 = Integer.valueOf((int) (c0479f2.f10419a / c0479f2.f10420b));
                C0479f c0479f3 = c0479fArr[2];
                return String.format(StubApp.getString2(8827), valueOf, valueOf2, Integer.valueOf((int) (c0479f3.f10419a / c0479f3.f10420b)));
            }
            try {
                return Double.toString(c10.g(this.f10467g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C0477d c(String str) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(8829));
        }
        if (StubApp.getString2(8803).equals(str)) {
            if (f10454t) {
                Log.d(StubApp.getString2(8612), StubApp.getString2(8830));
            }
            str = StubApp.getString2(3839);
        }
        for (int i3 = 0; i3 < f10442V.length; i3++) {
            C0477d c0477d = (C0477d) this.f10465e[i3].get(str);
            if (c0477d != null) {
                return c0477d;
            }
        }
        return null;
    }

    public final void d(C0480g c0480g) {
        String str;
        String str2;
        String str3;
        String string2 = StubApp.getString2(8831);
        String string22 = StubApp.getString2(8832);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0483j.a(mediaMetadataRetriever, new C0474a(c0480g));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if (string2.equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if (string2.equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f10465e;
                if (str != null) {
                    hashMapArr[0].put(StubApp.getString2("3844"), C0477d.e(Integer.parseInt(str), this.f10467g));
                }
                if (str2 != null) {
                    hashMapArr[0].put(StubApp.getString2("3845"), C0477d.e(Integer.parseInt(str2), this.f10467g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put(StubApp.getString2("3846"), C0477d.e(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f10467g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException(StubApp.getString2("8834"));
                    }
                    c0480g.seek(parseInt2);
                    byte[] bArr = new byte[6];
                    c0480g.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i10 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f10449c0)) {
                        throw new IOException(StubApp.getString2("8833"));
                    }
                    byte[] bArr2 = new byte[i10];
                    c0480g.readFully(bArr2);
                    this.f10474o = i3;
                    v(0, bArr2);
                }
                if (f10454t) {
                    Log.d(StubApp.getString2("8612"), string22 + str + StubApp.getString2("925") + str2 + StubApp.getString2("8835") + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException(StubApp.getString2("8836"));
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    public final void e(C0475b c0475b, int i3, int i10) {
        int i11;
        String string2 = StubApp.getString2(8612);
        boolean z2 = f10454t;
        if (z2) {
            Log.d(string2, StubApp.getString2(8837) + c0475b);
        }
        c0475b.f10406c = ByteOrder.BIG_ENDIAN;
        byte readByte = c0475b.readByte();
        String string22 = StubApp.getString2(8838);
        byte b2 = -1;
        if (readByte != -1) {
            throw new IOException(string22 + Integer.toHexString(readByte & UByte.MAX_VALUE));
        }
        if (c0475b.readByte() != -40) {
            throw new IOException(string22 + Integer.toHexString(readByte & UByte.MAX_VALUE));
        }
        int i12 = 2;
        while (true) {
            byte readByte2 = c0475b.readByte();
            if (readByte2 != b2) {
                throw new IOException(StubApp.getString2(8842) + Integer.toHexString(readByte2 & UByte.MAX_VALUE));
            }
            byte readByte3 = c0475b.readByte();
            if (z2) {
                Log.d(string2, StubApp.getString2(8839) + Integer.toHexString(readByte3 & UByte.MAX_VALUE));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c0475b.readUnsignedShort();
                int i13 = readUnsignedShort - 2;
                int i14 = i12 + 4;
                if (z2) {
                    Log.d(string2, StubApp.getString2(8840) + Integer.toHexString(readByte3 & UByte.MAX_VALUE) + StubApp.getString2(8841) + readUnsignedShort + StubApp.getString2(74));
                }
                String string23 = StubApp.getString2(8795);
                if (i13 < 0) {
                    throw new IOException(string23);
                }
                HashMap[] hashMapArr = this.f10465e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i13];
                    c0475b.readFully(bArr);
                    int i15 = i14 + i13;
                    byte[] bArr2 = f10449c0;
                    if (bArr2 != null && i13 >= bArr2.length) {
                        for (int i16 = 0; i16 < bArr2.length; i16++) {
                            i11 = 0;
                            if (bArr[i16] == bArr2[i16]) {
                            }
                        }
                        i11 = 0;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i13);
                        this.f10474o = i3 + i14 + bArr2.length;
                        v(i10, copyOfRange);
                        E(new C0475b(copyOfRange));
                        i14 = i15;
                        i13 = i11;
                    } else {
                        i11 = 0;
                    }
                    byte[] bArr3 = f10450d0;
                    if (bArr3 != null && i13 >= bArr3.length) {
                        int i17 = i11;
                        while (true) {
                            if (i17 >= bArr3.length) {
                                int length = i14 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i13);
                                String string24 = StubApp.getString2(8679);
                                if (b(string24) == null) {
                                    hashMapArr[i11].put(string24, new C0477d(length, copyOfRange2, 1, copyOfRange2.length));
                                    this.f10478s = true;
                                }
                            } else if (bArr[i17] == bArr3[i17]) {
                                i17++;
                            }
                        }
                    }
                    i14 = i15;
                    i13 = i11;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (readByte3) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (readByte3) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (readByte3) {
                                            }
                                    }
                            }
                    }
                    c0475b.a(1);
                    hashMapArr[i10].put(i10 != 4 ? StubApp.getString2(3845) : StubApp.getString2(8769), C0477d.b(c0475b.readUnsignedShort(), this.f10467g));
                    hashMapArr[i10].put(i10 != 4 ? StubApp.getString2(3844) : StubApp.getString2(8768), C0477d.b(c0475b.readUnsignedShort(), this.f10467g));
                    i13 = readUnsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i13];
                    c0475b.readFully(bArr4);
                    String string25 = StubApp.getString2(8706);
                    if (b(string25) == null) {
                        hashMapArr[1].put(string25, C0477d.a(new String(bArr4, f10448b0)));
                    }
                    i13 = 0;
                }
                if (i13 < 0) {
                    throw new IOException(string23);
                }
                c0475b.a(i13);
                i12 = i14 + i13;
                b2 = -1;
            }
        }
        c0475b.f10406c = this.f10467g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(4:118|119|(7:123|124|125|(3:127|(1:129)(2:138|(1:140))|(3:132|133|134))(1:141)|136|121|120)|144)|117|22|23|24|25|26|(1:92)(1:30)|31|(1:33)(8:35|36|37|38|39|(1:41)(1:78)|42|(1:44)(3:45|(2:46|(2:48|(2:51|52)(1:50))(2:76|77))|(1:54)(4:55|(2:56|(2:58|(1:61)(1:60))(3:66|67|(2:68|(2:70|(1:73)(1:72))(2:74|75))))|62|(1:64)(1:65)))))|21|22|23|24|25|26|(1:28)|92|31|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:14|15|16|17|18|19|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(4:118|119|(7:123|124|125|(3:127|(1:129)(2:138|(1:140))|(3:132|133|134))(1:141)|136|121|120)|144)|117|22|23|24|25|26|(1:92)(1:30)|31|(1:33)(8:35|36|37|38|39|(1:41)(1:78)|42|(1:44)(3:45|(2:46|(2:48|(2:51|52)(1:50))(2:76|77))|(1:54)(4:55|(2:56|(2:58|(1:61)(1:60))(3:66|67|(2:68|(2:70|(1:73)(1:72))(2:74|75))))|62|(1:64)(1:65)))))|21|22|23|24|25|26|(1:28)|92|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0103, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0105, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0108, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0101, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0066, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00d7, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0109, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010b, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010e, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fd, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0481h.f(java.io.BufferedInputStream):int");
    }

    public final void g(C0480g c0480g) {
        int i3;
        int i10;
        j(c0480g);
        HashMap[] hashMapArr = this.f10465e;
        C0477d c0477d = (C0477d) hashMapArr[1].get(StubApp.getString2(8705));
        if (c0477d != null) {
            C0480g c0480g2 = new C0480g(c0477d.f10414d);
            c0480g2.f10406c = this.f10467g;
            byte[] bArr = f10423C;
            byte[] bArr2 = new byte[bArr.length];
            c0480g2.readFully(bArr2);
            c0480g2.seek(0L);
            byte[] bArr3 = f10424D;
            byte[] bArr4 = new byte[bArr3.length];
            c0480g2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0480g2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0480g2.seek(12L);
            }
            w(c0480g2, 6);
            C0477d c0477d2 = (C0477d) hashMapArr[7].get(StubApp.getString2(8774));
            C0477d c0477d3 = (C0477d) hashMapArr[7].get(StubApp.getString2(8775));
            if (c0477d2 != null && c0477d3 != null) {
                hashMapArr[5].put(StubApp.getString2(8665), c0477d2);
                hashMapArr[5].put(StubApp.getString2(8666), c0477d3);
            }
            C0477d c0477d4 = (C0477d) hashMapArr[8].get(StubApp.getString2(8776));
            if (c0477d4 != null) {
                int[] iArr = (int[]) c0477d4.j(this.f10467g);
                if (iArr == null || iArr.length != 4) {
                    Log.w(StubApp.getString2(8612), StubApp.getString2(8845) + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i3 = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i3 - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                C0477d e10 = C0477d.e(i13, this.f10467g);
                C0477d e11 = C0477d.e(i14, this.f10467g);
                hashMapArr[0].put(StubApp.getString2(3844), e10);
                hashMapArr[0].put(StubApp.getString2(3845), e11);
            }
        }
    }

    public final void h(C0475b c0475b) {
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8846) + c0475b);
        }
        c0475b.f10406c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f10425E;
        c0475b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c0475b.readInt();
                byte[] bArr2 = new byte[4];
                c0475b.readFully(bArr2);
                int i3 = length + 8;
                if (i3 == 16 && !Arrays.equals(bArr2, f10427G)) {
                    throw new IOException(StubApp.getString2("8847"));
                }
                if (Arrays.equals(bArr2, f10428H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f10426F)) {
                    byte[] bArr3 = new byte[readInt];
                    c0475b.readFully(bArr3);
                    int readInt2 = c0475b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f10474o = i3;
                        v(0, bArr3);
                        H();
                        E(new C0475b(bArr3));
                        return;
                    }
                    throw new IOException(StubApp.getString2("8848") + readInt2 + StubApp.getString2("8849") + crc32.getValue());
                }
                int i10 = readInt + 4;
                c0475b.a(i10);
                length = i3 + i10;
            } catch (EOFException unused) {
                throw new IOException(StubApp.getString2(8850));
            }
        }
    }

    public final void i(C0475b c0475b) {
        String string2 = StubApp.getString2(8612);
        boolean z2 = f10454t;
        if (z2) {
            Log.d(string2, StubApp.getString2(8851) + c0475b);
        }
        c0475b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0475b.readFully(bArr);
        c0475b.readFully(bArr2);
        c0475b.readFully(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        c0475b.a(i3 - c0475b.f10405b);
        c0475b.readFully(bArr4);
        e(new C0475b(bArr4), i3, 5);
        c0475b.a(i11 - c0475b.f10405b);
        c0475b.f10406c = ByteOrder.BIG_ENDIAN;
        int readInt = c0475b.readInt();
        if (z2) {
            Xa.h.v(readInt, StubApp.getString2(8852), string2);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = c0475b.readUnsignedShort();
            int readUnsignedShort2 = c0475b.readUnsignedShort();
            if (readUnsignedShort == f10441U.f10415a) {
                short readShort = c0475b.readShort();
                short readShort2 = c0475b.readShort();
                C0477d e10 = C0477d.e(readShort, this.f10467g);
                C0477d e11 = C0477d.e(readShort2, this.f10467g);
                HashMap[] hashMapArr = this.f10465e;
                hashMapArr[0].put(StubApp.getString2(3845), e10);
                hashMapArr[0].put(StubApp.getString2(3844), e11);
                if (z2) {
                    Log.d(string2, StubApp.getString2(8853) + ((int) readShort) + StubApp.getString2(8854) + ((int) readShort2));
                    return;
                }
                return;
            }
            c0475b.a(readUnsignedShort2);
        }
    }

    public final void j(C0480g c0480g) {
        s(c0480g);
        w(c0480g, 0);
        G(c0480g, 0);
        G(c0480g, 5);
        G(c0480g, 4);
        H();
        if (this.f10464d == 8) {
            HashMap[] hashMapArr = this.f10465e;
            C0477d c0477d = (C0477d) hashMapArr[1].get(StubApp.getString2(8705));
            if (c0477d != null) {
                C0480g c0480g2 = new C0480g(c0477d.f10414d);
                c0480g2.f10406c = this.f10467g;
                c0480g2.a(6);
                w(c0480g2, 9);
                HashMap hashMap = hashMapArr[9];
                String string2 = StubApp.getString2(8708);
                C0477d c0477d2 = (C0477d) hashMap.get(string2);
                if (c0477d2 != null) {
                    hashMapArr[1].put(string2, c0477d2);
                }
            }
        }
    }

    public final void k(C0480g c0480g) {
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8855) + c0480g);
        }
        j(c0480g);
        HashMap[] hashMapArr = this.f10465e;
        C0477d c0477d = (C0477d) hashMapArr[0].get(StubApp.getString2(8678));
        if (c0477d != null) {
            e(new C0475b(c0477d.f10414d), (int) c0477d.f10413c, 5);
        }
        C0477d c0477d2 = (C0477d) hashMapArr[0].get(StubApp.getString2(8677));
        HashMap hashMap = hashMapArr[1];
        String string2 = StubApp.getString2(3839);
        C0477d c0477d3 = (C0477d) hashMap.get(string2);
        if (c0477d2 == null || c0477d3 != null) {
            return;
        }
        hashMapArr[1].put(string2, c0477d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] l() {
        /*
            r8 = this;
            r0 = 8612(0x21a4, float:1.2068E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r1 = r8.f10468h
            r2 = 0
            if (r1 != 0) goto Le
            goto L9d
        Le:
            byte[] r1 = r8.f10472m
            if (r1 == 0) goto L13
            return r1
        L13:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f10463c     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            if (r1 == 0) goto L39
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L27
            if (r3 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L27
        L20:
            r3 = r2
            goto L62
        L22:
            r0 = move-exception
            r3 = r2
        L24:
            r2 = r1
            goto L9e
        L27:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L8c
        L2c:
            java.lang.String r3 = "8856"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L27
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L27
            hc.b.p(r1)
            return r2
        L39:
            java.lang.String r1 = r8.f10461a     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            if (r1 == 0) goto L4d
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.lang.String r3 = r8.f10461a     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            goto L20
        L45:
            r0 = move-exception
            r3 = r2
            goto L9e
        L48:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L8c
        L4d:
            java.io.FileDescriptor r1 = r8.f10462b     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.io.FileDescriptor r1 = b0.AbstractC0482i.b(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r4 = 0
            b0.AbstractC0482i.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L88
            r7 = r3
            r3 = r1
            r1 = r7
        L62:
            b0.b r4 = new b0.b     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r5 = r8.f10470k     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r6 = r8.f10474o     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r5 = r5 + r6
            r4.a(r5)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            int r5 = r8.f10471l     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r8.f10472m = r5     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            hc.b.p(r1)
            if (r3 == 0) goto L80
            hc.b.o(r3)
        L80:
            return r5
        L81:
            r0 = move-exception
            goto L24
        L83:
            r4 = move-exception
            goto L8c
        L85:
            r0 = move-exception
            r3 = r1
            goto L9e
        L88:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L8c:
            java.lang.String r5 = "8857"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L81
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L81
            hc.b.p(r1)
            if (r3 == 0) goto L9d
            hc.b.o(r3)
        L9d:
            return r2
        L9e:
            hc.b.p(r2)
            if (r3 == 0) goto La6
            hc.b.o(r3)
        La6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0481h.l():byte[]");
    }

    public final void m(C0475b c0475b) {
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8858) + c0475b);
        }
        c0475b.f10406c = ByteOrder.LITTLE_ENDIAN;
        c0475b.a(f10429I.length);
        int readInt = c0475b.readInt() + 8;
        byte[] bArr = f10430J;
        c0475b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c0475b.readFully(bArr2);
                int readInt2 = c0475b.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f10431K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c0475b.readFully(bArr3);
                    this.f10474o = i3;
                    v(0, bArr3);
                    E(new C0475b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i3 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException(StubApp.getString2("8859"));
                }
                c0475b.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException(StubApp.getString2(8860));
            }
        }
    }

    public final void o(C0475b c0475b, HashMap hashMap) {
        C0477d c0477d = (C0477d) hashMap.get(StubApp.getString2(8665));
        C0477d c0477d2 = (C0477d) hashMap.get(StubApp.getString2(8666));
        if (c0477d == null || c0477d2 == null) {
            return;
        }
        int h2 = c0477d.h(this.f10467g);
        int h4 = c0477d2.h(this.f10467g);
        if (this.f10464d == 7) {
            h2 += this.f10475p;
        }
        if (h2 > 0 && h4 > 0) {
            this.f10468h = true;
            if (this.f10461a == null && this.f10463c == null && this.f10462b == null) {
                byte[] bArr = new byte[h4];
                c0475b.a(h2);
                c0475b.readFully(bArr);
                this.f10472m = bArr;
            }
            this.f10470k = h2;
            this.f10471l = h4;
        }
        if (f10454t) {
            Log.d(StubApp.getString2(8612), StubApp.getString2(8861) + h2 + StubApp.getString2(8862) + h4);
        }
    }

    public final boolean q(HashMap hashMap) {
        C0477d c0477d = (C0477d) hashMap.get(StubApp.getString2(3845));
        C0477d c0477d2 = (C0477d) hashMap.get(StubApp.getString2(3844));
        if (c0477d == null || c0477d2 == null) {
            return false;
        }
        return c0477d.h(this.f10467g) <= 512 && c0477d2.h(this.f10467g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:9:0x0020, B:15:0x003d, B:17:0x0048, B:18:0x005e, B:27:0x004f, B:30:0x0057, B:31:0x005b, B:32:0x0068, B:34:0x0071, B:36:0x0077, B:38:0x007d, B:40:0x0083, B:50:0x0091), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = b0.C0481h.f10454t
            if (r8 == 0) goto Lb3
            r1 = 0
            r2 = r1
        L6:
            b0.e[][] r3 = b0.C0481h.f10442V     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 >= r3) goto L20
            java.util.HashMap[] r3 = r7.f10465e     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r4.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3[r2] = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r2 + 1
            goto L6
        L17:
            r8 = move-exception
            goto La1
        L1a:
            r8 = move-exception
            goto L8f
        L1d:
            r8 = move-exception
            goto L8f
        L20:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r8 = r7.f(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.f10464d = r8     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L68
            if (r8 == r5) goto L68
            if (r8 == r4) goto L68
            if (r8 != r3) goto L3d
            goto L68
        L3d:
            b0.g r8 = new b0.g     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r1 = r7.f10464d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r2 = 12
            if (r1 != r2) goto L4c
            r7.d(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L4c:
            r2 = 7
            if (r1 != r2) goto L53
            r7.g(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L53:
            r2 = 10
            if (r1 != r2) goto L5b
            r7.k(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L5b:
            r7.j(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L5e:
            int r1 = r7.f10474o     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.seek(r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.E(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L68:
            b0.b r8 = new b0.b     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r7.f10464d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 != r6) goto L75
            r7.e(r8, r1, r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L75:
            if (r2 != r4) goto L7b
            r7.h(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L7b:
            if (r2 != r5) goto L81
            r7.i(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L81:
            if (r2 != r3) goto L86
            r7.m(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L86:
            r7.a()
            if (r0 == 0) goto Lb2
            r7.t()
            return
        L8f:
            if (r0 == 0) goto Laa
            java.lang.String r1 = "8612"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "8863"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L17
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L17
            goto Laa
        La1:
            r7.a()
            if (r0 == 0) goto La9
            r7.t()
        La9:
            throw r8
        Laa:
            r7.a()
            if (r0 == 0) goto Lb2
            r7.t()
        Lb2:
            return
        Lb3:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r0 = 8864(0x22a0, float:1.2421E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0481h.r(java.io.InputStream):void");
    }

    public final void s(C0480g c0480g) {
        ByteOrder u2 = u(c0480g);
        this.f10467g = u2;
        c0480g.f10406c = u2;
        int readUnsignedShort = c0480g.readUnsignedShort();
        int i3 = this.f10464d;
        if (i3 != 7 && i3 != 10 && readUnsignedShort != 42) {
            throw new IOException(StubApp.getString2(8865) + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0480g.readInt();
        if (readInt < 8) {
            throw new IOException(u.p(readInt, StubApp.getString2(8866)));
        }
        int i10 = readInt - 8;
        if (i10 > 0) {
            c0480g.a(i10);
        }
    }

    public final void t() {
        int i3 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f10465e;
            if (i3 >= hashMapArr.length) {
                return;
            }
            StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(8867), StubApp.getString2(8868));
            u2.append(hashMapArr[i3].size());
            String sb2 = u2.toString();
            String string2 = StubApp.getString2(8612);
            Log.d(string2, sb2);
            for (Map.Entry entry : hashMapArr[i3].entrySet()) {
                C0477d c0477d = (C0477d) entry.getValue();
                Log.d(string2, StubApp.getString2(8869) + ((String) entry.getKey()) + StubApp.getString2(8870) + c0477d.toString() + StubApp.getString2(8871) + c0477d.i(this.f10467g) + StubApp.getString2(620));
            }
            i3++;
        }
    }

    public final void v(int i3, byte[] bArr) {
        C0480g c0480g = new C0480g(bArr);
        s(c0480g);
        w(c0480g, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(b0.C0480g r27, int r28) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0481h.w(b0.g, int):void");
    }

    public final void x(String str) {
        for (int i3 = 0; i3 < f10442V.length; i3++) {
            this.f10465e[i3].remove(str);
        }
    }

    public final void y(int i3, String str, String str2) {
        HashMap[] hashMapArr = this.f10465e;
        if (hashMapArr[i3].isEmpty() || hashMapArr[i3].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i3];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i3].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0116 A[Catch: all -> 0x0126, Exception -> 0x0129, TryCatch #17 {Exception -> 0x0129, all -> 0x0126, blocks: (B:67:0x0112, B:69:0x0116, B:71:0x0134, B:75:0x012c), top: B:66:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c A[Catch: all -> 0x0126, Exception -> 0x0129, TryCatch #17 {Exception -> 0x0129, all -> 0x0126, blocks: (B:67:0x0112, B:69:0x0116, B:71:0x0134, B:75:0x012c), top: B:66:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0481h.z():void");
    }

    public C0481h(FileDescriptor fileDescriptor) {
        boolean z2;
        FileInputStream fileInputStream;
        Throwable th;
        C0478e[][] c0478eArr = f10442V;
        this.f10465e = new HashMap[c0478eArr.length];
        this.f10466f = new HashSet(c0478eArr.length);
        this.f10467g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f10463c = null;
            this.f10461a = null;
            if (p(fileDescriptor)) {
                this.f10462b = fileDescriptor;
                try {
                    fileDescriptor = AbstractC0482i.b(fileDescriptor);
                    z2 = true;
                } catch (Exception e10) {
                    throw new IOException(StubApp.getString2(8785), e10);
                }
            } else {
                this.f10462b = null;
                z2 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    r(fileInputStream);
                    hc.b.p(fileInputStream);
                    if (z2) {
                        hc.b.o(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    hc.b.p(fileInputStream);
                    if (z2) {
                        hc.b.o(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException(StubApp.getString2(8786));
        }
    }

    public C0481h(InputStream inputStream) {
        C0478e[][] c0478eArr = f10442V;
        this.f10465e = new HashMap[c0478eArr.length];
        this.f10466f = new HashSet(c0478eArr.length);
        this.f10467g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f10461a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f10463c = (AssetManager.AssetInputStream) inputStream;
                this.f10462b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (p(fileInputStream.getFD())) {
                        this.f10463c = null;
                        this.f10462b = fileInputStream.getFD();
                    }
                }
                this.f10463c = null;
                this.f10462b = null;
            }
            r(inputStream);
            return;
        }
        throw new NullPointerException(StubApp.getString2(8787));
    }
}
