package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 ¬\u00012\u00020\u0001:\u0004¬\u0001\u00ad\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0014H\u0017J.\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010.\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u00101\u001a\u000202H\u0017J.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J$\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u00101\u001a\u000205H\u0017JZ\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\n2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00142\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00142\b\u0010?\u001a\u0004\u0018\u00010@H\u0017JV\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00102&\u0010D\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u00010Ej\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u0001`F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0017JV\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00102&\u0010D\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u00010Ej\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u0001`F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0017J&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010L\u001a\u00020/2\b\u0010M\u001a\u0004\u0018\u00010,H\u0017J$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u0010H\u0017J$\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0017J\u0010\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0010H\u0002J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u0014H\u0017J\u0010\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0010H\u0017J\b\u0010Z\u001a\u00020\u0010H\u0017J\u0012\u0010[\u001a\u0004\u0018\u00010:2\u0006\u00107\u001a\u00020\u0010H\u0017J8\u0010\\\u001a*\u0012\u0004\u0012\u00020\u0010\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020X0Ej\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020X`F0!2\u0006\u0010B\u001a\u00020\u0010H\u0017J$\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020X0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0010H\u0017J\u001c\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/0!2\u0006\u0010B\u001a\u00020\u0010H\u0017J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0017J\u001c\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/0!2\u0006\u0010(\u001a\u00020\u0010H\u0017J\u0018\u0010a\u001a\u00020X2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u0010H\u0017J\u0018\u0010b\u001a\u00020X2\u0006\u0010c\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u0010H\u0017J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00150eH\u0017J\u0010\u0010f\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0010H\u0017J\u001c\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/0!2\u0006\u0010#\u001a\u00020\u0010H\u0017J\u0018\u0010h\u001a\u00020X2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u0010H\u0017J\u0010\u0010i\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0010H\u0017J\b\u0010j\u001a\u00020kH\u0017J\u0010\u0010l\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0010H\u0017J\u0010\u0010m\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0010H\u0017J$\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010o\u001a\u00020pH\u0017J$\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010r\u001a\u00020sH\u0017J\u001c\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0!2\u0006\u0010(\u001a\u00020\u0010H\u0017J\b\u0010u\u001a\u00020\nH\u0017J\u0006\u0010v\u001a\u00020\nJ\r\u0010w\u001a\u00020SH\u0000¢\u0006\u0002\bxJ&\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010HH\u0017J&\u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010(\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010,H\u0017J2\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0017J\u001c\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u00107\u001a\u00020\u0010H\u0017J\u001c\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u0010H\u0017J\u001c\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010(\u001a\u00020\u0010H\u0017J\u001d\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010O\u001a\u00020\u0010H\u0017J\u001d\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u0010H\u0017J'\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0017J)\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0017J%\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020:H\u0017J&\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0007\u0010\u0087\u0001\u001a\u00020\u0010H\u0017J\u001d\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010.\u001a\u00020/H\u0017J&\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010Y\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J\u001f\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0017J!\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0017J\u001d\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u00109\u001a\u00020:H\u0017J\u001e\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0007\u0010\u0087\u0001\u001a\u00020\u0010H\u0017J4\u0010\u008c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010r\u001a\u00020s2\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020&0eH\u0017J-\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u000e\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u0014H\u0017J/\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0017J\u0012\u0010\u0094\u0001\u001a\u00020S2\u0007\u0010\u0095\u0001\u001a\u00020\u0010H\u0017JB\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102#\u0010\u0097\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/0Ej\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/`FH\u0017J.\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J%\u0010\u0099\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0017J.\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J.\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010c\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J\u001e\u0010\u009c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0007\u0010\u009d\u0001\u001a\u00020/H\u0017J\u001d\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010.\u001a\u00020/H\u0017J&\u0010\u009f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010Y\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J%\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0017J.\u0010¡\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J\u001d\u0010¢\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010.\u001a\u00020/H\u0017J&\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010Y\u001a\u00020\u00102\u0007\u0010\u008a\u0001\u001a\u00020/H\u0017J\u0012\u0010¤\u0001\u001a\u00020S2\u0007\u0010¥\u0001\u001a\u00020kH\u0017J\u0011\u0010¦\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0010H\u0017J\u0011\u0010§\u0001\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0010H\u0017J3\u0010¨\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0014H\u0017J%\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u00109\u001a\u00020:H\u0017JM\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00102&\u0010D\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u00010Ej\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u0001`FH\u0017JM\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\"0!2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00102&\u0010D\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u00010Ej\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/\u0018\u0001`FH\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012¨\u0006®\u0001"}, d2 = {"Lcom/mapbox/maps/Style;", "Lcom/mapbox/maps/MapboxStyleManager;", "styleManager", "Lcom/mapbox/maps/StyleManager;", "pixelRatio", "", "mapLoadingErrorDelegate", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "isStyleValid", "", "styleDefaultCamera", "Lcom/mapbox/maps/CameraOptions;", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "styleJSON", "", "getStyleJSON", "()Ljava/lang/String;", "styleLayers", "", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleLayers", "()Ljava/util/List;", "styleSlots", "getStyleSlots$annotations", "()V", "getStyleSlots", "styleSources", "getStyleSources", "styleURI", "getStyleURI", "addGeoJSONSourceFeatures", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "sourceId", "dataId", "features", "Lcom/mapbox/geojson/Feature;", "addPersistentStyleCustomLayer", "layerId", "layerHost", "Lcom/mapbox/maps/CustomLayerHost;", "layerPosition", "Lcom/mapbox/maps/LayerPosition;", "addPersistentStyleLayer", "properties", "Lcom/mapbox/bindgen/Value;", "addStyleCustomGeometrySource", "options", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "addStyleCustomLayer", "addStyleCustomRasterSource", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "addStyleImage", "imageId", "scale", "image", "Lcom/mapbox/maps/Image;", "sdf", "stretchX", "Lcom/mapbox/maps/ImageStretches;", "stretchY", "content", "Lcom/mapbox/maps/ImageContent;", "addStyleImportFromJSON", "importId", "json", "config", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "importPosition", "Lcom/mapbox/maps/ImportPosition;", "addStyleImportFromURI", "uri", "addStyleLayer", "parameters", "position", "addStyleModel", "modelId", "modelUri", "addStyleSource", "checkNativeStyle", "", "methodName", "getFeaturesets", "Lcom/mapbox/maps/FeaturesetDescriptor;", "getStyleAtmosphereProperty", "Lcom/mapbox/maps/StylePropertyValue;", "property", "getStyleGlyphURL", "getStyleImage", "getStyleImportConfigProperties", "getStyleImportConfigProperty", "getStyleImportSchema", "getStyleImports", "getStyleLayerProperties", "getStyleLayerProperty", "getStyleLightProperty", "id", "getStyleLights", "", "getStyleProjectionProperty", "getStyleSourceProperties", "getStyleSourceProperty", "getStyleTerrainProperty", "getStyleTransition", "Lcom/mapbox/maps/TransitionOptions;", "hasStyleImage", "hasStyleModel", "invalidateStyleCustomGeometrySourceRegion", "coordinateBounds", "Lcom/mapbox/maps/CoordinateBounds;", "invalidateStyleCustomGeometrySourceTile", "tileId", "Lcom/mapbox/maps/CanonicalTileID;", "isStyleLayerPersistent", "isStyleLoaded", "isValid", "markInvalid", "markInvalid$maps_sdk_release", "moveStyleImport", "moveStyleLayer", "removeGeoJSONSourceFeatures", "featureIds", "removeStyleImage", "removeStyleImport", "removeStyleLayer", "removeStyleModel", "removeStyleSource", "setImportColorTheme", "bitmap", "Landroid/graphics/Bitmap;", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", "base64", "setStyleAtmosphere", "setStyleAtmosphereProperty", "value", "setStyleColorTheme", "setStyleCustomGeometrySourceTileData", "featureCollection", "setStyleCustomRasterSourceTileData", "tiles", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "setStyleGeoJSONSourceData", "data", "Lcom/mapbox/maps/GeoJSONSourceData;", "setStyleGlyphURL", "url", "setStyleImportConfigProperties", "configs", "setStyleImportConfigProperty", "setStyleLayerProperties", "setStyleLayerProperty", "setStyleLightProperty", "setStyleLights", "lights", "setStyleProjection", "setStyleProjectionProperty", "setStyleSourceProperties", "setStyleSourceProperty", "setStyleTerrain", "setStyleTerrainProperty", "setStyleTransition", "transitionOptions", "styleLayerExists", "styleSourceExists", "updateGeoJSONSourceFeatures", "updateStyleImageSourceImage", "updateStyleImportWithJSON", "updateStyleImportWithURI", "Companion", "OnStyleLoaded", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Style extends MapboxStyleManager {
    private volatile boolean isStyleValid;
    public static final String DARK = StubApp.getString2(14197);
    public static final String LIGHT = StubApp.getString2(14198);
    public static final String MAPBOX_STREETS = StubApp.getString2(14199);
    public static final String OUTDOORS = StubApp.getString2(14200);
    public static final String SATELLITE = StubApp.getString2(14201);
    public static final String SATELLITE_STREETS = StubApp.getString2(14202);
    public static final String STANDARD = StubApp.getString2(13967);
    public static final String STANDARD_SATELLITE = StubApp.getString2(14203);
    private static final String TAG = StubApp.getString2(14204);
    public static final String TRAFFIC_DAY = StubApp.getString2(14205);
    public static final String TRAFFIC_NIGHT = StubApp.getString2(14206);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/Style$OnStyleLoaded;", "", "onStyleLoaded", "", "style", "Lcom/mapbox/maps/Style;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnStyleLoaded {
        void onStyleLoaded(Style style);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Style(StyleManager styleManager, float f10, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        super(styleManager, f10, mapLoadingErrorDelegate);
        Intrinsics.checkNotNullParameter(styleManager, "styleManager");
        Intrinsics.checkNotNullParameter(mapLoadingErrorDelegate, "mapLoadingErrorDelegate");
        this.isStyleValid = true;
    }

    private final void checkNativeStyle(String methodName) {
        if (this.isStyleValid) {
            return;
        }
        MapboxLogger.logW(StubApp.getString2(14204), StubApp.getString2(14207) + methodName + StubApp.getString2(14208));
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(features, "features");
        if (!this.isStyleValid) {
            MapboxLogger.logW(StubApp.getString2(14204), StubApp.getString2(14209));
        }
        return super.addGeoJSONSourceFeatures(sourceId, dataId, features);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(layerHost, "layerHost");
        checkNativeStyle(StubApp.getString2(14210));
        return super.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14211));
        return super.addPersistentStyleLayer(properties, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(options, "options");
        checkNativeStyle(StubApp.getString2(14212));
        return super.addStyleCustomGeometrySource(sourceId, options);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(layerHost, "layerHost");
        checkNativeStyle(StubApp.getString2(14213));
        return super.addStyleCustomLayer(layerId, layerHost, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String sourceId, CustomRasterSourceOptions options) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(options, "options");
        checkNativeStyle(StubApp.getString2(14214));
        return super.addStyleCustomRasterSource(sourceId, options);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(stretchX, "stretchX");
        Intrinsics.checkNotNullParameter(stretchY, "stretchY");
        checkNativeStyle(StubApp.getString2(14215));
        return super.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImportFromJSON(String importId, String json, HashMap<String, Value> config, ImportPosition importPosition) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(json, "json");
        checkNativeStyle(StubApp.getString2(14216));
        return super.addStyleImportFromJSON(importId, json, config, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleImportFromURI(String importId, String uri, HashMap<String, Value> config, ImportPosition importPosition) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        checkNativeStyle(StubApp.getString2(14217));
        return super.addStyleImportFromURI(importId, uri, config, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleLayer(Value parameters, LayerPosition position) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        checkNativeStyle(StubApp.getString2(14218));
        return super.addStyleLayer(parameters, position);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> addStyleModel(String modelId, String modelUri) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(modelUri, "modelUri");
        checkNativeStyle(StubApp.getString2(14219));
        return super.addStyleModel(modelId, modelUri);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> addStyleSource(String sourceId, Value properties) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14220));
        return super.addStyleSource(sourceId, properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        checkNativeStyle(StubApp.getString2(14221));
        return super.getFeaturesets();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleAtmosphereProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        checkNativeStyle(StubApp.getString2(14222));
        return super.getStyleAtmosphereProperty(property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public CameraOptions getStyleDefaultCamera() {
        checkNativeStyle(StubApp.getString2(14223));
        return super.getStyleDefaultCamera();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public String getStyleGlyphURL() {
        checkNativeStyle(StubApp.getString2(14224));
        return super.getStyleGlyphURL();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Image getStyleImage(String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        checkNativeStyle(StubApp.getString2(14225));
        return super.getStyleImage(imageId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String importId) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        checkNativeStyle(StubApp.getString2(14226));
        return super.getStyleImportConfigProperties(importId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String importId, String config) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(config, "config");
        checkNativeStyle(StubApp.getString2(14227));
        return super.getStyleImportConfigProperty(importId, config);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleImportSchema(String importId) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        checkNativeStyle(StubApp.getString2(14228));
        return super.getStyleImportSchema(importId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleImports() {
        checkNativeStyle(StubApp.getString2(14229));
        return super.getStyleImports();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public String getStyleJSON() {
        checkNativeStyle(StubApp.getString2(14230));
        return super.getStyleJSON();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleLayerProperties(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        checkNativeStyle(StubApp.getString2(14231));
        return super.getStyleLayerProperties(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(property, "property");
        checkNativeStyle(StubApp.getString2(14232));
        return super.getStyleLayerProperty(layerId, property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleLayers() {
        checkNativeStyle(StubApp.getString2(14233));
        return super.getStyleLayers();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleLightProperty(String id, String property) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(property, "property");
        checkNativeStyle(StubApp.getString2(14234));
        return super.getStyleLightProperty(id, property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleLights() {
        checkNativeStyle(StubApp.getString2(14235));
        return super.getStyleLights();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleProjectionProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        checkNativeStyle(StubApp.getString2(14236));
        return super.getStyleProjectionProperty(property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<String> getStyleSlots() {
        checkNativeStyle(StubApp.getString2(14237));
        return super.getStyleSlots();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Value> getStyleSourceProperties(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        checkNativeStyle(StubApp.getString2(14238));
        return super.getStyleSourceProperties(sourceId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(property, "property");
        checkNativeStyle(StubApp.getString2(14239));
        return super.getStyleSourceProperty(sourceId, property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public List<StyleObjectInfo> getStyleSources() {
        checkNativeStyle(StubApp.getString2(14240));
        return super.getStyleSources();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public StylePropertyValue getStyleTerrainProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        checkNativeStyle(StubApp.getString2(14241));
        return super.getStyleTerrainProperty(property);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public TransitionOptions getStyleTransition() {
        checkNativeStyle(StubApp.getString2(14242));
        return super.getStyleTransition();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public String getStyleURI() {
        checkNativeStyle(StubApp.getString2(14243));
        return super.getStyleURI();
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean hasStyleImage(String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        checkNativeStyle(StubApp.getString2(14244));
        return super.hasStyleImage(imageId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public boolean hasStyleModel(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        checkNativeStyle(StubApp.getString2(14245));
        return super.hasStyleModel(modelId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(coordinateBounds, "coordinateBounds");
        checkNativeStyle(StubApp.getString2(14246));
        return super.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        checkNativeStyle(StubApp.getString2(14247));
        return super.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        checkNativeStyle(StubApp.getString2(14248));
        return super.isStyleLayerPersistent(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean isStyleLoaded() {
        checkNativeStyle(StubApp.getString2(14249));
        return super.isStyleLoaded();
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsStyleValid() {
        return this.isStyleValid;
    }

    public final void markInvalid$maps_sdk_release() {
        this.isStyleValid = false;
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> moveStyleImport(String importId, ImportPosition importPosition) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        checkNativeStyle(StubApp.getString2(14250));
        return super.moveStyleImport(importId, importPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        checkNativeStyle(StubApp.getString2(14251));
        return super.moveStyleLayer(layerId, layerPosition);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeGeoJSONSourceFeatures(String sourceId, String dataId, List<String> featureIds) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(featureIds, "featureIds");
        if (!this.isStyleValid) {
            MapboxLogger.logW(StubApp.getString2(14204), StubApp.getString2(14252));
        }
        return super.removeGeoJSONSourceFeatures(sourceId, dataId, featureIds);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleImage(String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        checkNativeStyle(StubApp.getString2(14253));
        return super.removeStyleImage(imageId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleImport(String importId) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        checkNativeStyle(StubApp.getString2(14254));
        return super.removeStyleImport(importId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleLayer(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        checkNativeStyle(StubApp.getString2(14255));
        return super.removeStyleLayer(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        checkNativeStyle(StubApp.getString2(14256));
        return super.removeStyleModel(modelId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> removeStyleSource(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        checkNativeStyle(StubApp.getString2(14257));
        return super.removeStyleSource(sourceId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, ColorTheme colorTheme) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        checkNativeStyle(StubApp.getString2(14258));
        return super.setImportColorTheme(importId, colorTheme);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleAtmosphere(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14259));
        return super.setStyleAtmosphere(properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14260));
        return super.setStyleAtmosphereProperty(property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        checkNativeStyle(StubApp.getString2(14261));
        return super.setStyleColorTheme(colorTheme);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        Intrinsics.checkNotNullParameter(featureCollection, "featureCollection");
        checkNativeStyle(StubApp.getString2(14262));
        return super.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String sourceId, List<CustomRasterSourceTileData> tiles) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        checkNativeStyle(StubApp.getString2(14263));
        return super.setStyleCustomRasterSourceTileData(sourceId, tiles);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.isStyleValid) {
            MapboxLogger.logW(StubApp.getString2(14204), StubApp.getString2(14264));
        }
        return super.setStyleGeoJSONSourceData(sourceId, dataId, data);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public void setStyleGlyphURL(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        checkNativeStyle(StubApp.getString2(14265));
        super.setStyleGlyphURL(url);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleImportConfigProperties(String importId, HashMap<String, Value> configs) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(configs, "configs");
        checkNativeStyle(StubApp.getString2(14266));
        return super.setStyleImportConfigProperties(importId, configs);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleImportConfigProperty(String importId, String config, Value value) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14267));
        return super.setStyleImportConfigProperty(importId, config, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14268));
        return super.setStyleLayerProperties(layerId, properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14269));
        return super.setStyleLayerProperty(layerId, property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLightProperty(String id, String property, Value value) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14270));
        return super.setStyleLightProperty(id, property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleLights(Value lights) {
        Intrinsics.checkNotNullParameter(lights, "lights");
        checkNativeStyle(StubApp.getString2(14271));
        return super.setStyleLights(lights);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleProjection(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14272));
        return super.setStyleProjection(properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14273));
        return super.setStyleProjectionProperty(property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14274));
        return super.setStyleSourceProperties(sourceId, properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14275));
        return super.setStyleSourceProperty(sourceId, property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleTerrain(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        checkNativeStyle(StubApp.getString2(14276));
        return super.setStyleTerrain(properties);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeStyle(StubApp.getString2(14277));
        return super.setStyleTerrainProperty(property, value);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public void setStyleTransition(TransitionOptions transitionOptions) {
        Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
        checkNativeStyle(StubApp.getString2(14278));
        super.setStyleTransition(transitionOptions);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean styleLayerExists(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        checkNativeStyle(StubApp.getString2(14279));
        return super.styleLayerExists(layerId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public boolean styleSourceExists(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        checkNativeStyle(StubApp.getString2(14280));
        return super.styleSourceExists(sourceId);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(features, "features");
        if (!this.isStyleValid) {
            MapboxLogger.logW(StubApp.getString2(14204), StubApp.getString2(14281));
        }
        return super.updateGeoJSONSourceFeatures(sourceId, dataId, features);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(image, "image");
        checkNativeStyle(StubApp.getString2(14282));
        return super.updateStyleImageSourceImage(sourceId, image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImportWithJSON(String importId, String json, HashMap<String, Value> config) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(json, "json");
        checkNativeStyle(StubApp.getString2(14283));
        return super.updateStyleImportWithJSON(importId, json, config);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    public Expected<String, None> updateStyleImportWithURI(String importId, String uri, HashMap<String, Value> config) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        checkNativeStyle(StubApp.getString2(14284));
        return super.updateStyleImportWithURI(importId, uri, config);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        checkNativeStyle(StubApp.getString2(14258));
        return super.setImportColorTheme(importId, bitmap);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        checkNativeStyle(StubApp.getString2(14261));
        return super.setStyleColorTheme(bitmap);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, String base64) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(base64, "base64");
        checkNativeStyle(StubApp.getString2(14258));
        return super.setImportColorTheme(importId, base64);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        checkNativeStyle(StubApp.getString2(14261));
        return super.setStyleColorTheme(base64);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Image image) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(image, "image");
        checkNativeStyle(StubApp.getString2(14258));
        return super.setImportColorTheme(importId, image);
    }

    @Override // com.mapbox.maps.MapboxStyleManager
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        checkNativeStyle(StubApp.getString2(14261));
        return super.setStyleColorTheme(image);
    }
}
