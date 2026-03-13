package com.mapbox.maps;

import R8.C0250h;
import android.graphics.RectF;
import android.os.Handler;
import android.webkit.URLUtil;
import c5.B;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.Style;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.interactions.FeatureState;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeatureStateKey;
import com.mapbox.maps.interactions.FeaturesetFeature;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import com.stub.StubApp;
import g7.InterfaceC0962a;
import h7.InterfaceC1010a;
import h7.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000à\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000 \u0094\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u0094\u0004B!\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010!J;\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010(J/\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b'\u0010)J\u001f\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b'\u0010!J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001bH\u0007¢\u0006\u0004\b'\u0010*J;\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b,\u0010(J/\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b,\u0010)J\u001f\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b,\u0010!J\u0017\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001bH\u0007¢\u0006\u0004\b,\u0010*J#\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b \u0010/J;\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b \u00100J/\u0010 \u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\b \u00101J\u0011\u00105\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u001f2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0015H\u0016¢\u0006\u0004\b>\u0010\u0017J\u0017\u0010A\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ#\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010=J\u0017\u0010W\u001a\u00020\u001f2\u0006\u0010V\u001a\u00020UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0015H\u0016¢\u0006\u0004\bY\u0010\u0017J\u0015\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\r\u0010^\u001a\u00020Z¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\u00020\u001f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001f0fH\u0007¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\b\u0012\u0004\u0012\u00020k0jH\u0007¢\u0006\u0004\bl\u0010mJ%\u0010p\u001a\u00020\u001f2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j2\u0006\u0010o\u001a\u00020\u0015H\u0007¢\u0006\u0004\bp\u0010qJI\u0010|\u001a\u0002072\u0006\u0010s\u001a\u00020r2\b\u0010u\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010v2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010zH\u0017¢\u0006\u0004\b|\u0010}J?\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010vH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J3\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0086\u0001JH\u0010\u0081\u0001\u001a\u0002072\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010zH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0087\u0001J^\u0010\u0081\u0001\u001a\u00020\u001f2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0j2\u0007\u0010\u0083\u0001\u001a\u0002072\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010t2\b\u0010y\u001a\u0004\u0018\u00010v2\b\u0010{\u001a\u0004\u0018\u00010z2\u0014\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001f0\u0088\u0001H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u008a\u0001J;\u0010\u008e\u0001\u001a\u0002072\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010t2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010vH\u0017¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0092\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u001c\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0096\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0083\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u001c\u0010\u0099\u0001\u001a\u00020r2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00020z2\u0007\u0010\u009b\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J&\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020z0j2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0jH\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010¡\u0001\u001a\u00020~2\u0007\u0010 \u0001\u001a\u00020zH\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J'\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020~0j2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020z0jH\u0016¢\u0006\u0006\b¤\u0001\u0010\u009f\u0001J\u001c\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u0010 \u0001\u001a\u00020zH\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J(\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010j2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020z0jH\u0016¢\u0006\u0006\b¨\u0001\u0010\u009f\u0001J$\u0010«\u0001\u001a\u00020v2\u0007\u0010©\u0001\u001a\u00020v2\u0007\u0010ª\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001b\u0010«\u0001\u001a\u00020v2\u0007\u0010©\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b«\u0001\u0010\u00ad\u0001J\u001c\u0010°\u0001\u001a\u00030¯\u00012\u0007\u0010®\u0001\u001a\u00020~H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001c\u0010³\u0001\u001a\u00020~2\b\u0010²\u0001\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J%\u0010·\u0001\u001a\u00030¶\u00012\u0007\u0010®\u0001\u001a\u00020~2\u0007\u0010µ\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J%\u0010¹\u0001\u001a\u00020~2\b\u0010\u009b\u0001\u001a\u00030¶\u00012\u0007\u0010µ\u0001\u001a\u00020vH\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J0\u0010À\u0001\u001a\u00030¿\u00012\b\u0010\u008c\u0001\u001a\u00030»\u00012\u0007\u0010L\u001a\u00030¼\u00012\b\u0010¾\u0001\u001a\u00030½\u0001H\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J/\u0010Å\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030Ã\u00012\b\u0010¾\u0001\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010É\u0001\u001a\u00020\u001f2\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JG\u0010Ñ\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\n\b\u0002\u0010Ï\u0001\u001a\u00030Î\u00012\t\b\u0002\u0010{\u001a\u00030Î\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001H\u0007¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J.\u0010Ó\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J.\u0010Õ\u0001\u001a\u00030¿\u00012\u0007\u0010Ë\u0001\u001a\u00020\u001b2\b\u0010Í\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÕ\u0001\u0010Ô\u0001JD\u0010Û\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J7\u0010Û\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010Ù\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bÛ\u0001\u0010Ý\u0001J:\u0010ß\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Þ\u0001H\u0016¢\u0006\u0006\bß\u0001\u0010à\u0001J-\u0010ß\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Þ\u0001¢\u0006\u0006\bß\u0001\u0010á\u0001JE\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\t\u0010â\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bã\u0001\u0010ä\u0001J8\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bã\u0001\u0010å\u0001J-\u0010ã\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\u0007\u0010×\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bã\u0001\u0010æ\u0001J1\u0010ç\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\t\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001H\u0016¢\u0006\u0006\bç\u0001\u0010æ\u0001J$\u0010ç\u0001\u001a\u00030¿\u00012\u0007\u0010Â\u0001\u001a\u00020\u001b2\b\u0010¾\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0010\u0010é\u0001\u001a\u00020\u001f¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001d\u0010í\u0001\u001a\u00030¿\u00012\b\u0010ì\u0001\u001a\u00030ë\u0001H\u0016¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001d\u0010ñ\u0001\u001a\u00030¿\u00012\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0016¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001d\u0010õ\u0001\u001a\u00030¿\u00012\b\u0010ô\u0001\u001a\u00030ó\u0001H\u0016¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001d\u0010ù\u0001\u001a\u00030¿\u00012\b\u0010ø\u0001\u001a\u00030÷\u0001H\u0016¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u001d\u0010ý\u0001\u001a\u00030¿\u00012\b\u0010ü\u0001\u001a\u00030û\u0001H\u0016¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001d\u0010\u0081\u0002\u001a\u00030¿\u00012\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0016¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001d\u0010\u0085\u0002\u001a\u00030¿\u00012\b\u0010\u0084\u0002\u001a\u00030\u0083\u0002H\u0016¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u001d\u0010\u0089\u0002\u001a\u00030¿\u00012\b\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0016¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J\u001d\u0010\u008d\u0002\u001a\u00030¿\u00012\b\u0010\u008c\u0002\u001a\u00030\u008b\u0002H\u0016¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u001d\u0010\u0091\u0002\u001a\u00030¿\u00012\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0016¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u001d\u0010\u0095\u0002\u001a\u00030¿\u00012\b\u0010\u0094\u0002\u001a\u00030\u0093\u0002H\u0016¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\u001d\u0010\u0099\u0002\u001a\u00030¿\u00012\b\u0010\u0098\u0002\u001a\u00030\u0097\u0002H\u0017¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u001d\u0010\u009d\u0002\u001a\u00030¿\u00012\b\u0010\u009c\u0002\u001a\u00030\u009b\u0002H\u0016¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u001d\u0010¡\u0002\u001a\u00030¿\u00012\b\u0010 \u0002\u001a\u00030\u009f\u0002H\u0016¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u001d\u0010¥\u0002\u001a\u00030¿\u00012\b\u0010¤\u0002\u001a\u00030£\u0002H\u0016¢\u0006\u0006\b¥\u0002\u0010¦\u0002J&\u0010ª\u0002\u001a\u00030¿\u00012\u0007\u0010§\u0002\u001a\u00020\u001b2\b\u0010©\u0002\u001a\u00030¨\u0002H\u0017¢\u0006\u0006\bª\u0002\u0010«\u0002J\u001c\u0010®\u0002\u001a\u00020\u001f2\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0017¢\u0006\u0006\b®\u0002\u0010¯\u0002J\u001c\u0010°\u0002\u001a\u00020\u001f2\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0017¢\u0006\u0006\b°\u0002\u0010¯\u0002J\u001c\u0010³\u0002\u001a\u00020\u001f2\b\u0010²\u0002\u001a\u00030±\u0002H\u0017¢\u0006\u0006\b³\u0002\u0010´\u0002J\u001c\u0010µ\u0002\u001a\u00020\u001f2\b\u0010²\u0002\u001a\u00030±\u0002H\u0017¢\u0006\u0006\bµ\u0002\u0010´\u0002J\u001a\u0010¶\u0002\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0006\b¶\u0002\u0010·\u0002J\u001a\u0010¸\u0002\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0017¢\u0006\u0006\b¸\u0002\u0010·\u0002J\u001c\u0010»\u0002\u001a\u00020\u001f2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0017¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u001c\u0010½\u0002\u001a\u00020\u001f2\b\u0010º\u0002\u001a\u00030¹\u0002H\u0017¢\u0006\u0006\b½\u0002\u0010¼\u0002J\u001c\u0010À\u0002\u001a\u00020\u001f2\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0017¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J\u001c\u0010Â\u0002\u001a\u00020\u001f2\b\u0010¿\u0002\u001a\u00030¾\u0002H\u0017¢\u0006\u0006\bÂ\u0002\u0010Á\u0002J\u001c\u0010Å\u0002\u001a\u00020\u001f2\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0017¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J\u001c\u0010Ç\u0002\u001a\u00020\u001f2\b\u0010Ä\u0002\u001a\u00030Ã\u0002H\u0017¢\u0006\u0006\bÇ\u0002\u0010Æ\u0002J\u001c\u0010Ê\u0002\u001a\u00020\u001f2\b\u0010É\u0002\u001a\u00030È\u0002H\u0017¢\u0006\u0006\bÊ\u0002\u0010Ë\u0002J\u001c\u0010Ì\u0002\u001a\u00020\u001f2\b\u0010É\u0002\u001a\u00030È\u0002H\u0017¢\u0006\u0006\bÌ\u0002\u0010Ë\u0002J\u001c\u0010Ï\u0002\u001a\u00020\u001f2\b\u0010Î\u0002\u001a\u00030Í\u0002H\u0017¢\u0006\u0006\bÏ\u0002\u0010Ð\u0002J\u001c\u0010Ñ\u0002\u001a\u00020\u001f2\b\u0010Î\u0002\u001a\u00030Í\u0002H\u0017¢\u0006\u0006\bÑ\u0002\u0010Ð\u0002J\u001c\u0010Ô\u0002\u001a\u00020\u001f2\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0017¢\u0006\u0006\bÔ\u0002\u0010Õ\u0002J\u001c\u0010Ö\u0002\u001a\u00020\u001f2\b\u0010Ó\u0002\u001a\u00030Ò\u0002H\u0017¢\u0006\u0006\bÖ\u0002\u0010Õ\u0002J\u001c\u0010Ù\u0002\u001a\u00020\u001f2\b\u0010Ø\u0002\u001a\u00030×\u0002H\u0017¢\u0006\u0006\bÙ\u0002\u0010Ú\u0002J\u001c\u0010Û\u0002\u001a\u00020\u001f2\b\u0010Ø\u0002\u001a\u00030×\u0002H\u0017¢\u0006\u0006\bÛ\u0002\u0010Ú\u0002J\u001c\u0010Þ\u0002\u001a\u00020\u001f2\b\u0010Ý\u0002\u001a\u00030Ü\u0002H\u0017¢\u0006\u0006\bÞ\u0002\u0010ß\u0002J\u001c\u0010à\u0002\u001a\u00020\u001f2\b\u0010Ý\u0002\u001a\u00030Ü\u0002H\u0017¢\u0006\u0006\bà\u0002\u0010ß\u0002J\u001c\u0010ã\u0002\u001a\u00020\u001f2\b\u0010â\u0002\u001a\u00030á\u0002H\u0017¢\u0006\u0006\bã\u0002\u0010ä\u0002J\u001c\u0010å\u0002\u001a\u00020\u001f2\b\u0010â\u0002\u001a\u00030á\u0002H\u0017¢\u0006\u0006\bå\u0002\u0010ä\u0002J\u001c\u0010è\u0002\u001a\u00020\u001f2\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0017¢\u0006\u0006\bè\u0002\u0010é\u0002J\u001c\u0010ê\u0002\u001a\u00020\u001f2\b\u0010ç\u0002\u001a\u00030æ\u0002H\u0017¢\u0006\u0006\bê\u0002\u0010é\u0002J\u0010\u0010ë\u0002\u001a\u00020\u001f¢\u0006\u0006\bë\u0002\u0010ê\u0001J\u0013\u0010í\u0002\u001a\u00030ì\u0002H\u0016¢\u0006\u0006\bí\u0002\u0010î\u0002J\u001a\u00109\u001a\u00020\u001f2\b\u0010ï\u0002\u001a\u00030ì\u0002H\u0016¢\u0006\u0005\b9\u0010ð\u0002J\u001b\u0010ñ\u0002\u001a\u0004\u0018\u00010v2\u0007\u0010\u009b\u0001\u001a\u00020~¢\u0006\u0006\bñ\u0002\u0010ò\u0002J\u001c\u0010õ\u0002\u001a\u00020\u001f2\n\u0010ô\u0002\u001a\u0005\u0018\u00010ó\u0002¢\u0006\u0006\bõ\u0002\u0010ö\u0002J\u0018\u0010ø\u0002\u001a\u00020\u001f2\u0007\u0010÷\u0002\u001a\u00020\u0015¢\u0006\u0005\bø\u0002\u0010=J\u000f\u0010ù\u0002\u001a\u00020\u0015¢\u0006\u0005\bù\u0002\u0010\u0017J\"\u0010ü\u0002\u001a\u00020\u001f2\u000e\u0010û\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020jH\u0007¢\u0006\u0006\bü\u0002\u0010ý\u0002J\u0018\u0010þ\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00020jH\u0007¢\u0006\u0005\bþ\u0002\u0010mJ%\u0010\u0081\u0003\u001a\u00020\u001f2\u0007\u0010L\u001a\u00030ÿ\u00022\b\u0010¾\u0001\u001a\u00030\u0080\u0003H\u0007¢\u0006\u0006\b\u0081\u0003\u0010\u0082\u0003J\u0012\u0010\u0083\u0003\u001a\u00020\u001fH\u0007¢\u0006\u0006\b\u0083\u0003\u0010ê\u0001J$\u0010\u0086\u0003\u001a\u0002072\u0007\u0010\u0084\u0003\u001a\u00020z2\u0007\u0010\u0085\u0003\u001a\u00020zH\u0016¢\u0006\u0006\b\u0086\u0003\u0010\u0087\u0003J\u001c\u0010\u008a\u0003\u001a\u00020\u001f2\b\u0010\u0089\u0003\u001a\u00030\u0088\u0003H\u0016¢\u0006\u0006\b\u008a\u0003\u0010\u008b\u0003J\u0013\u0010\u008c\u0003\u001a\u00030\u0088\u0003H\u0016¢\u0006\u0006\b\u008c\u0003\u0010\u008d\u0003J3\u0010\u0091\u0003\u001a\u0004\u0018\u00010\t2\u001d\u0010\u0090\u0003\u001a\u0018\u0012\u0005\u0012\u00030\u008e\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0088\u0001¢\u0006\u0003\b\u008f\u0003H\u0016¢\u0006\u0006\b\u0091\u0003\u0010\u0092\u0003J3\u0010\u0094\u0003\u001a\u0004\u0018\u00010\t2\u001d\u0010\u0090\u0003\u001a\u0018\u0012\u0005\u0012\u00030\u0093\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0088\u0001¢\u0006\u0003\b\u008f\u0003H\u0016¢\u0006\u0006\b\u0094\u0003\u0010\u0092\u0003J\u0012\u0010\u0096\u0003\u001a\u00020\u001fH\u0000¢\u0006\u0006\b\u0095\u0003\u0010ê\u0001J-\u0010\u009a\u0003\u001a\t\u0012\u0005\u0012\u00030\u0099\u00030j2\b\u0010\u0098\u0003\u001a\u00030\u0097\u00032\b\u00108\u001a\u0004\u0018\u000107H\u0007¢\u0006\u0006\b\u009a\u0003\u0010\u009b\u0003J\u0015\u0010\u009c\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0j¢\u0006\u0005\b\u009c\u0003\u0010mJ0\u0010¡\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009d\u0003\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030\u009e\u0003H\u0000¢\u0006\u0006\b\u009f\u0003\u0010 \u0003J=\u0010§\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u001d\u0010¤\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0018\u00010¢\u0003j\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u0001`£\u0003H\u0001¢\u0006\u0006\b¥\u0003\u0010¦\u0003J$\u0010ª\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u001b0¢\u0003j\t\u0012\u0004\u0012\u00020\u001b`£\u0003H\u0001¢\u0006\u0006\b¨\u0003\u0010©\u0003J0\u0010¬\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009d\u0003\u001a\u00020\u001b2\u0007\u0010L\u001a\u00030\u009e\u0003H\u0000¢\u0006\u0006\b«\u0003\u0010 \u0003J'\u0010¯\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020N0M2\u0007\u0010\u009d\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0006\b\u00ad\u0003\u0010®\u0003J(\u0010²\u0003\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0012\u0005\u0012\u00030\u009e\u00030M2\u0007\u0010°\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0006\b±\u0003\u0010®\u0003J\u001e\u0010·\u0003\u001a\u00020\u001f2\n\u0010´\u0003\u001a\u0005\u0018\u00010³\u0003H\u0000¢\u0006\u0006\bµ\u0003\u0010¶\u0003J\u001d\u0010º\u0003\u001a\u00030¿\u00012\b\u0010¹\u0003\u001a\u00030¸\u0003H\u0017¢\u0006\u0006\bº\u0003\u0010»\u0003J\u001c\u0010¾\u0003\u001a\u00020\u001f2\b\u0010½\u0003\u001a\u00030¼\u0003H\u0017¢\u0006\u0006\b¾\u0003\u0010¿\u0003JD\u0010Û\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u000e\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00032\u0007\u0010Ù\u0001\u001a\u00028\u00002\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bÛ\u0001\u0010Ä\u0003JR\u0010Û\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Å\u00032\b\u0010È\u0003\u001a\u00030Ç\u00032\u0007\u0010Ù\u0001\u001a\u00028\u00002\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bÛ\u0001\u0010É\u0003J?\u0010ß\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u000e\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00032\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ê\u0003H\u0007¢\u0006\u0006\bß\u0001\u0010Ë\u0003JM\u0010ß\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Å\u00032\b\u0010È\u0003\u001a\u00030Ç\u00032\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ê\u0003H\u0007¢\u0006\u0006\bß\u0001\u0010Ì\u0003JZ\u0010ã\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u0003\"\u0010\b\u0001\u0010Î\u0003*\t\u0012\u0004\u0012\u00028\u00000Í\u00032\u000e\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00028\u00000Â\u00032\u000b\b\u0002\u0010â\u0001\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bã\u0001\u0010Ï\u0003Jh\u0010ã\u0001\u001a\u00030¿\u0001\"\n\b\u0000\u0010Á\u0003*\u00030À\u0003\"\u0010\b\u0001\u0010Î\u0003*\t\u0012\u0004\u0012\u00028\u00000Í\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030Å\u00032\b\u0010È\u0003\u001a\u00030Ç\u00032\u000b\b\u0002\u0010â\u0001\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bã\u0001\u0010Ð\u0003J1\u0010ç\u0001\u001a\u00030¿\u00012\u0010\u0010Æ\u0003\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030Å\u00032\n\b\u0002\u0010¾\u0001\u001a\u00030Ú\u0001H\u0007¢\u0006\u0006\bç\u0001\u0010Ñ\u0003Jc\u0010À\u0001\u001a\u00030¿\u0001\"\u000e\b\u0000\u0010Ò\u0003*\u0007\u0012\u0002\b\u00030Â\u00032\u0012\u0010Æ\u0003\u001a\r\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000Å\u00032\f\b\u0002\u0010\u008c\u0001\u001a\u0005\u0018\u00010»\u00012\f\b\u0002\u0010Ó\u0003\u001a\u0005\u0018\u00010Ø\u00012\u000e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ô\u0003H\u0007¢\u0006\u0006\bÀ\u0001\u0010Õ\u0003J\u0013\u0010×\u0003\u001a\u00030Ö\u0003H\u0007¢\u0006\u0006\b×\u0003\u0010Ø\u0003J\u0016\u0010Ù\u0003\u001a\u00020\u0015*\u00020\u001bH\u0002¢\u0006\u0006\bÙ\u0003\u0010Ú\u0003J\u0019\u0010Û\u0003\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0005\bÛ\u0003\u0010*JA\u0010ß\u0003\u001a\u00020\u001f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0007\u0010Ü\u0003\u001a\u00020\u001d2\u000b\b\u0002\u0010Ý\u0003\u001a\u0004\u0018\u00010\u001d2\u000b\b\u0002\u0010Þ\u0003\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0006\bß\u0003\u0010à\u0003J\u0016\u0010á\u0003\u001a\u00020z*\u00020zH\u0002¢\u0006\u0006\bá\u0003\u0010â\u0003J&\u0010å\u0003\u001a\u00020\u001f2\u0007\u0010ã\u0003\u001a\u00020\u001b2\t\b\u0002\u0010ä\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0006\bå\u0003\u0010æ\u0003R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010ç\u0003R\u0019\u0010è\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0003\u0010é\u0003R\u0019\u0010ê\u0003\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0003\u0010é\u0003R\u001f\u0010ì\u0003\u001a\n\u0012\u0005\u0012\u00030¿\u00010ë\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0003\u0010í\u0003R\u001d\u0010\r\u001a\u00020\f8@X\u0080\u0004¢\u0006\u000f\n\u0005\b\r\u0010î\u0003\u001a\u0006\bï\u0003\u0010ð\u0003R2\u0010\u001c\u001a\u0004\u0018\u0001022\t\u0010ñ\u0003\u001a\u0004\u0018\u0001028F@@X\u0086\u000e¢\u0006\u0015\n\u0005\b\u001c\u0010ò\u0003\u001a\u0004\b5\u00104\"\u0006\bó\u0003\u0010ô\u0003R0\u0010õ\u0003\u001a\u00020\u00152\u0007\u0010ñ\u0003\u001a\u00020\u00158@@@X\u0080\u000e¢\u0006\u0016\n\u0006\bõ\u0003\u0010é\u0003\u001a\u0005\bö\u0003\u0010\u0017\"\u0005\b÷\u0003\u0010=R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ø\u0003R8\u0010ú\u0003\u001a\u0005\u0018\u00010ù\u00032\n\u0010ñ\u0003\u001a\u0005\u0018\u00010ù\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\bú\u0003\u0010û\u0003\u001a\u0006\bü\u0003\u0010ý\u0003\"\u0006\bþ\u0003\u0010ÿ\u0003R8\u0010\u0091\u0003\u001a\u0005\u0018\u00010\u008e\u00032\n\u0010ñ\u0003\u001a\u0005\u0018\u00010\u008e\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0003\u0010\u0080\u0004\u001a\u0006\b\u0081\u0004\u0010\u0082\u0004\"\u0006\b\u0083\u0004\u0010\u0084\u0004R8\u0010\u0094\u0003\u001a\u0005\u0018\u00010\u0093\u00032\n\u0010ñ\u0003\u001a\u0005\u0018\u00010\u0093\u00038@@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0003\u0010\u0085\u0004\u001a\u0006\b\u0086\u0004\u0010\u0087\u0004\"\u0006\b\u0088\u0004\u0010\u0089\u0004R\u0018\u0010\u008d\u0004\u001a\u00030\u008a\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0004\u0010\u008c\u0004R7\u0010n\u001a\t\u0012\u0004\u0012\u00020k0\u008e\u00042\u000e\u0010\u008f\u0004\u001a\t\u0012\u0004\u0012\u00020k0\u008e\u00048@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0004\u0010\u0091\u0004\"\u0006\b\u0092\u0004\u0010\u0093\u0004¨\u0006\u0095\u0004"}, d2 = {"Lcom/mapbox/maps/MapboxMap;", "Lg7/h;", "Lg7/g;", "Lg7/b;", "Lg7/d;", "Lg7/e;", "Lg7/a;", "Lcom/mapbox/maps/MapboxStyleManager;", "Lg7/c;", "", "Lcom/mapbox/maps/NativeMapImpl;", "nativeMap", "Lcom/mapbox/maps/NativeObserver;", "nativeObserver", "Lcom/mapbox/maps/StyleObserver;", "styleObserver", "<init>", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleObserver;)V", "", "pixelRatio", "(Lcom/mapbox/maps/NativeMapImpl;Lcom/mapbox/maps/NativeObserver;F)V", "", "isValid", "()Z", "Lcom/mapbox/maps/MapboxMapRecorder;", "createRecorder", "()Lcom/mapbox/maps/MapboxMapRecorder;", "", "style", "Lcom/mapbox/maps/Style$OnStyleLoaded;", "onStyleLoaded", "", "loadStyle", "(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "styleUri", "Lcom/mapbox/maps/TransitionOptions;", "styleTransitionOptions", "Lh7/c;", "onMapLoadErrorListener", "loadStyleUri", "(Ljava/lang/String;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lh7/c;)V", "(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;Lh7/c;)V", "(Ljava/lang/String;)V", "styleJson", "loadStyleJson", "LM6/a;", "styleExtension", "(LM6/a;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "(LM6/a;Lcom/mapbox/maps/TransitionOptions;Lcom/mapbox/maps/Style$OnStyleLoaded;Lh7/c;)V", "(LM6/a;Lcom/mapbox/maps/Style$OnStyleLoaded;Lh7/c;)V", "Lcom/mapbox/maps/Style;", "getStyleDeprecated", "()Lcom/mapbox/maps/Style;", "getStyle", "(Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "inProgress", "setGestureInProgress", "(Z)V", "isGestureInProgress", "Lcom/mapbox/maps/NorthOrientation;", "northOrientation", "setNorthOrientation", "(Lcom/mapbox/maps/NorthOrientation;)V", "Lcom/mapbox/maps/ConstrainMode;", "constrainMode", "setConstrainMode", "(Lcom/mapbox/maps/ConstrainMode;)V", "Lcom/mapbox/maps/ViewportMode;", "viewportMode", "setViewportMode", "(Lcom/mapbox/maps/ViewportMode;)V", "Lcom/mapbox/maps/CameraBoundsOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "setBounds", "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CameraBounds;", "getBounds", "()Lcom/mapbox/maps/CameraBounds;", "setUserAnimationInProgress", "Lcom/mapbox/maps/CameraAnimationHint;", "cameraAnimationHint", "setCameraAnimationHint", "(Lcom/mapbox/maps/CameraAnimationHint;)V", "isUserAnimationInProgress", "", "delta", "setPrefetchZoomDelta", "(B)V", "getPrefetchZoomDelta", "()B", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "Lcom/mapbox/maps/Size;", "getSize", "()Lcom/mapbox/maps/Size;", "Lkotlin/Function0;", "action", "whenSizeReady", "(Lkotlin/jvm/functions/Function0;)V", "", "Lcom/mapbox/maps/MapDebugOptions;", "getDebug", "()Ljava/util/List;", "debugOptions", "enabled", "setDebug", "(Ljava/util/List;Z)V", "Lcom/mapbox/maps/CoordinateBounds;", "bounds", "Lcom/mapbox/maps/EdgeInsets;", "boundsPadding", "", "bearing", "pitch", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", "offset", "cameraForCoordinateBounds", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/geojson/Point;", "coordinates", "coordinatesPadding", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/ScreenBox;", "box", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lkotlin/Function1;", "result", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V", "Lcom/mapbox/geojson/Geometry;", "geometry", "geometryPadding", "cameraForGeometry", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCameraUnwrapped", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "Landroid/graphics/RectF;", "rectF", "coordinateBoundsForRect", "(Landroid/graphics/RectF;)Lcom/mapbox/maps/CoordinateBounds;", "coordinate", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;", "pixelsForCoordinates", "(Ljava/util/List;)Ljava/util/List;", "pixel", "coordinateForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;", "pixels", "coordinatesForPixels", "Lcom/mapbox/maps/CoordinateInfo;", "coordinateInfoForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;", "coordinatesInfoForPixels", "latitude", "zoom", "getMetersPerPixelAtLatitude", "(DD)D", "(D)D", "point", "Lcom/mapbox/maps/ProjectedMeters;", "projectedMetersForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ProjectedMeters;", "projectedMeters", "coordinateForProjectedMeters", "(Lcom/mapbox/maps/ProjectedMeters;)Lcom/mapbox/geojson/Point;", "zoomScale", "Lcom/mapbox/maps/MercatorCoordinate;", "project", "(Lcom/mapbox/geojson/Point;D)Lcom/mapbox/maps/MercatorCoordinate;", "unproject", "(Lcom/mapbox/maps/MercatorCoordinate;D)Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "Lcom/mapbox/maps/RenderedQueryOptions;", "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "queryRenderedFeatures", "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "sourceId", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QuerySourceFeaturesCallback;", "querySourceFeatures", "(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Ljava/lang/Runnable;", "runnable", "executeOnRenderThread", "(Ljava/lang/Runnable;)V", "sourceIdentifier", "Lcom/mapbox/geojson/Feature;", "cluster", "", "limit", "Lcom/mapbox/maps/QueryFeatureExtensionCallback;", "getGeoJsonClusterLeaves", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "getGeoJsonClusterChildren", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "getGeoJsonClusterExpansionZoom", "sourceLayerId", "featureId", "Lcom/mapbox/bindgen/Value;", "state", "Lcom/mapbox/maps/FeatureStateOperationCallback;", "setFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/QueryFeatureStateCallback;", "getFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "stateKey", "removeFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "(Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "reduceMemoryUse", "()V", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "subscribeMapLoaded", "(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "mapIdleCallback", "subscribeMapIdle", "(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "subscribeSourceDataLoaded", "(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "subscribeSourceAdded", "(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "subscribeSourceRemoved", "(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "subscribeStyleImageRemoveUnused", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "subscribeCameraChanged", "(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "subscribeCameraChangedCoalesced", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "subscribeRenderFrameStarted", "(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "subscribeRenderFrameFinished", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "subscribeResourceRequest", "(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "genericEventCallback", "subscribeGenericEvent", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;", "Lh7/a;", "onCameraChangeListener", "addOnCameraChangeListener", "(Lh7/a;)V", "removeOnCameraChangeListener", "Lh7/b;", "onMapIdleListener", "addOnMapIdleListener", "(Lh7/b;)V", "removeOnMapIdleListener", "addOnMapLoadErrorListener", "(Lh7/c;)V", "removeOnMapLoadErrorListener", "Lh7/d;", "onMapLoadedListener", "addOnMapLoadedListener", "(Lh7/d;)V", "removeOnMapLoadedListener", "Lh7/f;", "onRenderFrameStartedListener", "addOnRenderFrameStartedListener", "(Lh7/f;)V", "removeOnRenderFrameStartedListener", "Lh7/e;", "onRenderFrameFinishedListener", "addOnRenderFrameFinishedListener", "(Lh7/e;)V", "removeOnRenderFrameFinishedListener", "Lh7/g;", "onSourceAddedListener", "addOnSourceAddedListener", "(Lh7/g;)V", "removeOnSourceAddedListener", "Lh7/h;", "onSourceDataLoadedListener", "addOnSourceDataLoadedListener", "(Lh7/h;)V", "removeOnSourceDataLoadedListener", "Lh7/i;", "onSourceRemovedListener", "addOnSourceRemovedListener", "(Lh7/i;)V", "removeOnSourceRemovedListener", "Lh7/m;", "onStyleLoadedListener", "addOnStyleLoadedListener", "(Lh7/m;)V", "removeOnStyleLoadedListener", "Lh7/j;", "onStyleDataLoadedListener", "addOnStyleDataLoadedListener", "(Lh7/j;)V", "removeOnStyleDataLoadedListener", "Lh7/k;", "onStyleImageMissingListener", "addOnStyleImageMissingListener", "(Lh7/k;)V", "removeOnStyleImageMissingListener", "Lh7/l;", "onStyleImageUnusedListener", "addOnStyleImageUnusedListener", "(Lh7/l;)V", "removeOnStyleImageUnusedListener", "triggerRepaint", "Lcom/mapbox/maps/FreeCameraOptions;", "getFreeCameraOptions", "()Lcom/mapbox/maps/FreeCameraOptions;", "freeCameraOptions", "(Lcom/mapbox/maps/FreeCameraOptions;)V", "getElevation", "(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "setTileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)V", "renderWorldCopies", "setRenderWorldCopies", "getRenderWorldCopies", "Lcom/mapbox/maps/Vec2;", "shape", "setScreenCullingShape", "(Ljava/util/List;)V", "getScreenCullingShape", "Lcom/mapbox/maps/PerformanceStatisticsOptions;", "Lcom/mapbox/maps/PerformanceStatisticsCallback;", "startPerformanceStatisticsCollection", "(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V", "stopPerformanceStatisticsCollection", "fromPoint", "toPoint", "cameraForDrag", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "mode", "setCenterAltitudeMode", "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V", "getCenterAltitudeMode", "()Lcom/mapbox/maps/MapCenterAltitudeMode;", "LY6/a;", "Lkotlin/ExtensionFunctionType;", "function", "cameraAnimationsPlugin", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Li7/c;", "gesturesPlugin", "onDestroy$maps_sdk_release", "onDestroy", "Lcom/mapbox/maps/TileCoverOptions;", "tileCoverOptions", "Lcom/mapbox/maps/CanonicalTileID;", "tileCover", "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;", "getAttributions", "viewId", "Lcom/mapbox/maps/ViewAnnotationOptions;", "addViewAnnotation$maps_sdk_release", "(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;", "addViewAnnotation", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "layerIds", "setViewAnnotationAvoidLayers$maps_sdk_release", "(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;", "setViewAnnotationAvoidLayers", "getViewAnnotationAvoidLayers$maps_sdk_release", "()Ljava/util/HashSet;", "getViewAnnotationAvoidLayers", "updateViewAnnotation$maps_sdk_release", "updateViewAnnotation", "removeViewAnnotation$maps_sdk_release", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "removeViewAnnotation", "identifier", "getViewAnnotationOptions$maps_sdk_release", "getViewAnnotationOptions", "Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;", "listener", "setViewAnnotationPositionsUpdateListener$maps_sdk_release", "(Lcom/mapbox/maps/DelegatingViewAnnotationPositionsUpdateListener;)V", "setViewAnnotationPositionsUpdateListener", "Lcom/mapbox/maps/MapInteraction;", "interaction", "addInteraction", "(Lcom/mapbox/maps/MapInteraction;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/PlatformEventInfo;", "platformEventInfo", "dispatch", "(Lcom/mapbox/maps/PlatformEventInfo;)V", "Lcom/mapbox/maps/interactions/FeatureState;", "FS", "Lcom/mapbox/maps/interactions/FeaturesetFeature;", "featuresetFeature", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;", "descriptor", "Lcom/mapbox/maps/FeaturesetFeatureId;", "id", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureState;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateCallback;", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/interactions/FeatureStateKey;", "FSK", "(Lcom/mapbox/maps/interactions/FeaturesetFeature;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/interactions/FeatureStateKey;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "FF", "filter", "Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;", "(Lcom/mapbox/maps/interactions/TypedFeaturesetDescriptor;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/interactions/QueryRenderedFeaturesetFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/Map;", "getNativeMap", "()Lcom/mapbox/maps/Map;", "isValidUri", "(Ljava/lang/String;)Z", "applyStyle", "styleDataStyleLoadedListener", "styleDataSpritesLoadedListener", "styleDataSourcesLoadedListener", "initializeStyleLoad", "(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V", "clampScreenCoordinate", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/ScreenCoordinate;", "methodName", "checkMainThread", "checkNativeMap", "(Ljava/lang/String;Z)V", "Lcom/mapbox/maps/NativeMapImpl;", "isMapValid", "Z", "performanceCollectionStatisticsStarted", "", "interactions", "Ljava/util/List;", "Lcom/mapbox/maps/NativeObserver;", "getNativeObserver$maps_sdk_release", "()Lcom/mapbox/maps/NativeObserver;", "<set-?>", "Lcom/mapbox/maps/Style;", "setStyle$maps_sdk_release", "(Lcom/mapbox/maps/Style;)V", "isStyleLoadInitiated", "isStyleLoadInitiated$maps_sdk_release", "setStyleLoadInitiated$maps_sdk_release", "Lcom/mapbox/maps/StyleObserver;", "Landroid/os/Handler;", "renderHandler", "Landroid/os/Handler;", "getRenderHandler$maps_sdk_release", "()Landroid/os/Handler;", "setRenderHandler$maps_sdk_release", "(Landroid/os/Handler;)V", "LY6/a;", "getCameraAnimationsPlugin$maps_sdk_release", "()LY6/a;", "setCameraAnimationsPlugin$maps_sdk_release", "(LY6/a;)V", "Li7/c;", "getGesturesPlugin$maps_sdk_release", "()Li7/c;", "setGesturesPlugin$maps_sdk_release", "(Li7/c;)V", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "cameraState", "", "value", "getDebugOptions$maps_sdk_release", "()Ljava/util/Set;", "setDebugOptions$maps_sdk_release", "(Ljava/util/Set;)V", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMap extends MapboxStyleManager implements g7.h, g7.g, g7.b, g7.d, g7.e, InterfaceC0962a, g7.c {
    public static final /* synthetic */ long QFE_DEFAULT_LIMIT = 10;
    public static final /* synthetic */ long QFE_DEFAULT_OFFSET = 0;
    private Y6.a cameraAnimationsPlugin;
    private i7.c gesturesPlugin;
    private final List<Cancelable> interactions;
    private boolean isMapValid;
    private boolean isStyleLoadInitiated;
    private final NativeMapImpl nativeMap;
    private final NativeObserver nativeObserver;
    private boolean performanceCollectionStatisticsStarted;
    private Handler renderHandler;
    private Style style;
    private final StyleObserver styleObserver;
    public static final /* synthetic */ String QFE_CHILDREN = StubApp.getString2(14002);
    public static final /* synthetic */ String QFE_EXPANSION_ZOOM = StubApp.getString2(14003);
    public static final /* synthetic */ String QFE_LEAVES = StubApp.getString2(14004);
    public static final /* synthetic */ String QFE_LIMIT = StubApp.getString2(2106);
    public static final /* synthetic */ String QFE_OFFSET = StubApp.getString2(14005);
    public static final /* synthetic */ String QFE_SUPER_CLUSTER = StubApp.getString2(14006);
    private static final String TAG = StubApp.getString2(14001);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0081\u0002¢\u0006\u0002\b\u001eJ&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0080\u0002¢\u0006\u0002\b\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/mapbox/maps/MapboxMap$Companion;", "", "()V", "QFE_CHILDREN", "", "QFE_DEFAULT_LIMIT", "", "QFE_DEFAULT_OFFSET", "QFE_EXPANSION_ZOOM", "QFE_LEAVES", "QFE_LIMIT", "QFE_OFFSET", "QFE_SUPER_CLUSTER", "TAG", "calculateBoundingBox", "", "Lcom/mapbox/geojson/Point;", "points", "clearData", "", "callback", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "invoke", "Lcom/mapbox/maps/MapboxMap;", "nativeMap", "Lcom/mapbox/maps/NativeMapImpl;", "nativeObserver", "Lcom/mapbox/maps/NativeObserver;", "styleObserver", "Lcom/mapbox/maps/StyleObserver;", "invoke$maps_sdk_release", "pixelRatio", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Point> calculateBoundingBox(List<Point> points) {
            if (points.size() <= 2) {
                return points;
            }
            double d8 = Double.NEGATIVE_INFINITY;
            double d10 = Double.POSITIVE_INFINITY;
            double d11 = Double.POSITIVE_INFINITY;
            double d12 = Double.NEGATIVE_INFINITY;
            for (Point point : points) {
                double longitude = point.longitude();
                double latitude = point.latitude();
                if (d10 > longitude) {
                    d10 = longitude;
                }
                if (d11 > latitude) {
                    d11 = latitude;
                }
                if (d8 < longitude) {
                    d8 = longitude;
                }
                if (d12 < latitude) {
                    d12 = latitude;
                }
            }
            return CollectionsKt.listOf((Object[]) new Point[]{Point.fromLngLat(d10, d11), Point.fromLngLat(d8, d12)});
        }

        @JvmStatic
        public final void clearData(AsyncOperationResultCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            MapsResourceOptions.clearData(callback);
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMap, NativeObserver nativeObserver, StyleObserver styleObserver) {
            Intrinsics.checkNotNullParameter(nativeMap, "nativeMap");
            Intrinsics.checkNotNullParameter(nativeObserver, "nativeObserver");
            Intrinsics.checkNotNullParameter(styleObserver, "styleObserver");
            return new MapboxMap(nativeMap, nativeObserver, styleObserver, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }

        public final /* synthetic */ MapboxMap invoke$maps_sdk_release(NativeMapImpl nativeMap, NativeObserver nativeObserver, float pixelRatio) {
            Intrinsics.checkNotNullParameter(nativeMap, "nativeMap");
            Intrinsics.checkNotNullParameter(nativeObserver, "nativeObserver");
            return new MapboxMap(nativeMap, nativeObserver, pixelRatio, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMapImpl, nativeObserver, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NativeObserver nativeObserver, MapLoadingError error) {
        Intrinsics.checkNotNullParameter(nativeObserver, "$nativeObserver");
        Intrinsics.checkNotNullParameter(error, "error");
        nativeObserver.sendMapLoadingError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MapboxMap this$0, MapLoadingError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "error");
        this$0.nativeObserver.sendMapLoadingError(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(MapboxMap this$0, Style style) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(style, "style");
        this$0.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addInteraction$lambda$22(MapboxMap this$0, Cancelable cancelable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cancelable, "$cancelable");
        this$0.interactions.remove(cancelable);
        cancelable.cancel();
    }

    private final void applyStyle(String style) {
        if (isValidUri(style)) {
            this.nativeMap.setStyleURI(style);
            return;
        }
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (StringsKt.isBlank(style)) {
            style = StubApp.getString2(14007);
        }
        nativeMapImpl.setStyleJSON(style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$17(List coordinates, CameraOptions camera, EdgeInsets edgeInsets, Double d8, ScreenCoordinate screenCoordinate, MapboxMap this$0, String it) {
        Intrinsics.checkNotNullParameter(coordinates, "$coordinates");
        Intrinsics.checkNotNullParameter(camera, "$camera");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        MapboxLogger.logE(StubApp.getString2(14001), StubApp.getString2(14008) + coordinates + StubApp.getString2(13995) + camera + StubApp.getString2(13996) + edgeInsets + StubApp.getString2(13997) + d8 + StubApp.getString2(13998) + screenCoordinate + StubApp.getString2(13999) + this$0.nativeMap.getSize() + StubApp.getString2(3055) + it + StubApp.getString2(14000));
        CameraOptions build = new CameraOptions.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
        return build;
    }

    private final void checkNativeMap(String methodName, boolean checkMainThread) {
        if (checkMainThread) {
            ThreadChecker.INSTANCE.throwIfNotMainThread();
        }
        if (this.isMapValid) {
            return;
        }
        MapboxLogger.logW(StubApp.getString2(14001), StubApp.getString2(14009) + methodName + StubApp.getString2(14010));
    }

    public static /* synthetic */ void checkNativeMap$default(MapboxMap mapboxMap, String str, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        mapboxMap.checkNativeMap(str, z2);
    }

    private final ScreenCoordinate clampScreenCoordinate(ScreenCoordinate screenCoordinate) {
        Size size = this.nativeMap.getSize();
        double x7 = screenCoordinate.getX();
        double y10 = screenCoordinate.getY();
        if (screenCoordinate.getX() < 0.0d || screenCoordinate.getX() > size.getWidth()) {
            x7 = MathKt.roundToInt(screenCoordinate.getX());
        }
        if (screenCoordinate.getY() < 0.0d || screenCoordinate.getY() > size.getHeight()) {
            y10 = MathKt.roundToInt(screenCoordinate.getY());
        }
        return (0.0d > x7 || x7 > ((double) size.getWidth()) || 0.0d > y10 || y10 > ((double) size.getHeight())) ? new ScreenCoordinate(-1.0d, -1.0d) : new ScreenCoordinate(x7, y10);
    }

    @JvmStatic
    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        INSTANCE.clearData(asyncOperationResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$30$lambda$29(FeatureStateCallback callback, FeaturesetFeature featuresetFeature, Expected it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(featuresetFeature, "$featuresetFeature");
        Intrinsics.checkNotNullParameter(it, "it");
        it.onValue(new e(featuresetFeature, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$30$lambda$29$lambda$28(FeatureStateCallback callback, FeaturesetFeature featuresetFeature, Value stateAsValue) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(featuresetFeature, "$featuresetFeature");
        Intrinsics.checkNotNullParameter(stateAsValue, "stateAsValue");
        callback.onFeatureState(featuresetFeature.getDescriptor().getFeatureState(stateAsValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$31() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$34(FeatureStateCallback callback, TypedFeaturesetDescriptor descriptor, Expected it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(descriptor, "$descriptor");
        Intrinsics.checkNotNullParameter(it, "it");
        it.onValue(new d(callback, descriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFeatureState$lambda$34$lambda$33(FeatureStateCallback callback, TypedFeaturesetDescriptor descriptor, Value stateAsValue) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(descriptor, "$descriptor");
        Intrinsics.checkNotNullParameter(stateAsValue, "stateAsValue");
        callback.onFeatureState(descriptor.getFeatureState(stateAsValue));
    }

    public static /* synthetic */ Cancelable getGeoJsonClusterLeaves$default(MapboxMap mapboxMap, String str, Feature feature, long j, long j3, QueryFeatureExtensionCallback queryFeatureExtensionCallback, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            j = 10;
        }
        return mapboxMap.getGeoJsonClusterLeaves(str, feature, j, (i3 & 8) != 0 ? 0L : j3, queryFeatureExtensionCallback);
    }

    private final void initializeStyleLoad(Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded styleDataStyleLoadedListener, Style.OnStyleLoaded styleDataSpritesLoadedListener, Style.OnStyleLoaded styleDataSourcesLoadedListener) {
        this.style = null;
        this.styleObserver.setLoadStyleListener(onStyleLoaded, styleDataStyleLoadedListener, styleDataSpritesLoadedListener, styleDataSourcesLoadedListener);
        this.isStyleLoadInitiated = true;
    }

    public static /* synthetic */ void initializeStyleLoad$default(MapboxMap mapboxMap, Style.OnStyleLoaded onStyleLoaded, Style.OnStyleLoaded onStyleLoaded2, Style.OnStyleLoaded onStyleLoaded3, Style.OnStyleLoaded onStyleLoaded4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 4) != 0) {
            onStyleLoaded3 = null;
        }
        if ((i3 & 8) != 0) {
            onStyleLoaded4 = null;
        }
        mapboxMap.initializeStyleLoad(onStyleLoaded, onStyleLoaded2, onStyleLoaded3, onStyleLoaded4);
    }

    private final boolean isValidUri(String str) {
        return StringsKt.L(str, StubApp.getString2(14011)) || StringsKt.L(str, StubApp.getString2(14012)) || StringsKt.L(str, StubApp.getString2(14013)) || URLUtil.isValidUrl(str);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(str, onStyleLoaded);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$10(M6.a styleExtension, Style style) {
        Intrinsics.checkNotNullParameter(styleExtension, "$styleExtension");
        Intrinsics.checkNotNullParameter(style, "style");
        C0250h c0250h = (C0250h) styleExtension;
        Iterator it = ((List) c0250h.f6297b).iterator();
        while (it.hasNext()) {
            ((T6.d) it.next()).b(style);
        }
        for (Pair pair : (List) c0250h.f6300e) {
            ((P6.c) pair.component1()).d(style, (LayerPosition) pair.component2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$13(M6.a styleExtension, Style style) {
        Intrinsics.checkNotNullParameter(styleExtension, "$styleExtension");
        Intrinsics.checkNotNullParameter(style, "style");
        C0250h c0250h = (C0250h) styleExtension;
        Iterator it = ((List) c0250h.f6298c).iterator();
        while (it.hasNext()) {
            ((O6.b) it.next()).a(style);
        }
        Iterator it2 = ((List) c0250h.f6299d).iterator();
        if (it2.hasNext()) {
            throw com.mapbox.common.b.e(it2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStyle$lambda$7(M6.a styleExtension, Style style) {
        Intrinsics.checkNotNullParameter(styleExtension, "$styleExtension");
        Intrinsics.checkNotNullParameter(style, "style");
        styleExtension.getClass();
        TransitionOptions transitionOptions = (TransitionOptions) ((C0250h) styleExtension).f6301f;
        if (transitionOptions != null) {
            style.setStyleTransition(transitionOptions);
        }
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i3 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 8) != 0) {
            cVar = null;
        }
        mapboxMap.loadStyleJson(str, transitionOptions, onStyleLoaded, cVar);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i3 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 8) != 0) {
            cVar = null;
        }
        mapboxMap.loadStyleUri(str, transitionOptions, onStyleLoaded, cVar);
    }

    public static /* synthetic */ Cancelable queryRenderedFeatures$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, RenderedQueryGeometry renderedQueryGeometry, Value value, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            renderedQueryGeometry = null;
        }
        if ((i3 & 4) != 0) {
            value = null;
        }
        return mapboxMap.queryRenderedFeatures(typedFeaturesetDescriptor, renderedQueryGeometry, value, queryRenderedFeaturesetFeaturesCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$44(QueryRenderedFeaturesetFeaturesCallback callback, TypedFeaturesetDescriptor descriptor, Expected expected) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(descriptor, "$descriptor");
        Intrinsics.checkNotNullParameter(expected, "expected");
        expected.onValue(new f(descriptor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRenderedFeatures$lambda$44$lambda$43(QueryRenderedFeaturesetFeaturesCallback callback, TypedFeaturesetDescriptor descriptor, List listQueriedRenderedFeatureAsValue) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(descriptor, "$descriptor");
        Intrinsics.checkNotNullParameter(listQueriedRenderedFeatureAsValue, "listQueriedRenderedFeatureAsValue");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQueriedRenderedFeatureAsValue) {
            if (((QueriedRenderedFeature) obj).getQueriedFeature().getFeature().geometry() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QueriedRenderedFeature queriedRenderedFeature = (QueriedRenderedFeature) it.next();
            Feature feature = queriedRenderedFeature.getQueriedFeature().getFeature();
            Intrinsics.checkNotNullExpressionValue(feature, "it.queriedFeature.feature");
            FeaturesetFeatureId featuresetFeatureId = queriedRenderedFeature.getQueriedFeature().getFeaturesetFeatureId();
            String featureNamespace = featuresetFeatureId != null ? featuresetFeatureId.getFeatureNamespace() : null;
            Value state = queriedRenderedFeature.getQueriedFeature().getState();
            Intrinsics.checkNotNullExpressionValue(state, "it.queriedFeature.state");
            arrayList2.add(descriptor.getFeaturesetFeature(feature, featureNamespace, state));
        }
        callback.onQueryRenderedFeatures(arrayList2);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            featureStateKey = null;
        }
        if ((i3 & 4) != 0) {
            featureStateOperationCallback = new com.mapbox.common.module.cronet.a(4);
        }
        return mapboxMap.removeFeatureState(featuresetFeature, (FeaturesetFeature) featureStateKey, featureStateOperationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeFeatureState$lambda$37() {
    }

    public static /* synthetic */ Cancelable resetFeatureStates$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeatureStateOperationCallback featureStateOperationCallback, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            featureStateOperationCallback = new com.mapbox.common.module.cronet.a(9);
        }
        return mapboxMap.resetFeatureStates((TypedFeaturesetDescriptor<?, ?>) typedFeaturesetDescriptor, featureStateOperationCallback);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, FeaturesetFeature featuresetFeature, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            featureStateOperationCallback = new com.mapbox.common.module.cronet.a(6);
        }
        return mapboxMap.setFeatureState((FeaturesetFeature<FeaturesetFeature>) featuresetFeature, (FeaturesetFeature) featureState, featureStateOperationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFeatureState$lambda$25() {
    }

    @Override // g7.c
    @MapboxExperimental
    public Cancelable addInteraction(MapInteraction interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        checkNativeMap$default(this, StubApp.getString2(14014), false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        Interaction interaction2 = interaction.coreInteraction;
        Intrinsics.checkNotNullExpressionValue(interaction2, "interaction.coreInteraction");
        Cancelable addInteraction = nativeMapImpl.addInteraction(interaction2);
        this.interactions.add(addInteraction);
        return new M8.b(1, this, addInteraction);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeCameraChange] instead.", replaceWith = @ReplaceWith(expression = "subscribeCameraChanged(cameraChangedCallback)", imports = {}))
    public void addOnCameraChangeListener(InterfaceC1010a onCameraChangeListener) {
        Intrinsics.checkNotNullParameter(onCameraChangeListener, "onCameraChangeListener");
        checkNativeMap$default(this, StubApp.getString2(14015), false, 2, null);
        this.nativeObserver.addOnCameraChangeListener(onCameraChangeListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeMapIdle] instead.", replaceWith = @ReplaceWith(expression = "subscribeMapIdle(mapIdleCallback)", imports = {}))
    public void addOnMapIdleListener(h7.b onMapIdleListener) {
        Intrinsics.checkNotNullParameter(onMapIdleListener, "onMapIdleListener");
        checkNativeMap$default(this, StubApp.getString2(14016), false, 2, null);
        this.nativeObserver.addOnMapIdleListener(onMapIdleListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeMapLoadingError] instead.", replaceWith = @ReplaceWith(expression = "subscribeMapLoadingError(mapLoadingErrorCallback)", imports = {}))
    public void addOnMapLoadErrorListener(h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(onMapLoadErrorListener, "onMapLoadErrorListener");
        checkNativeMap$default(this, StubApp.getString2(14017), false, 2, null);
        this.nativeObserver.addOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeMapLoaded] instead.", replaceWith = @ReplaceWith(expression = "subscribeMapLoaded(mapLoadedCallback)", imports = {}))
    public void addOnMapLoadedListener(h7.d onMapLoadedListener) {
        Intrinsics.checkNotNullParameter(onMapLoadedListener, "onMapLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14018), false, 2, null);
        this.nativeObserver.addOnMapLoadedListener(onMapLoadedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeRenderFrameFinished] instead.", replaceWith = @ReplaceWith(expression = "subscribeRenderFrameFinished(renderFrameFinishedCallback)", imports = {}))
    public void addOnRenderFrameFinishedListener(h7.e onRenderFrameFinishedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        checkNativeMap$default(this, StubApp.getString2(14019), false, 2, null);
        this.nativeObserver.addOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeRenderFrameStarted] instead.", replaceWith = @ReplaceWith(expression = "subscribeRenderFrameStarted(renderFrameStartedCallback)", imports = {}))
    public void addOnRenderFrameStartedListener(h7.f onRenderFrameStartedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        checkNativeMap$default(this, StubApp.getString2(14020), false, 2, null);
        this.nativeObserver.addOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeSourceAdded] instead.", replaceWith = @ReplaceWith(expression = "subscribeSourceAdded(sourceAddedCallback)", imports = {}))
    public void addOnSourceAddedListener(h7.g onSourceAddedListener) {
        Intrinsics.checkNotNullParameter(onSourceAddedListener, "onSourceAddedListener");
        checkNativeMap$default(this, StubApp.getString2(14021), false, 2, null);
        this.nativeObserver.addOnSourceAddedListener(onSourceAddedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeSourceDataLoaded] instead.", replaceWith = @ReplaceWith(expression = "subscribeSourceDataLoaded(sourceDataLoadedCallback)", imports = {}))
    public void addOnSourceDataLoadedListener(h7.h onSourceDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14022), false, 2, null);
        this.nativeObserver.addOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeSourceRemoved] instead.", replaceWith = @ReplaceWith(expression = "subscribeSourceRemoved(sourceRemovedCallback)", imports = {}))
    public void addOnSourceRemovedListener(h7.i onSourceRemovedListener) {
        Intrinsics.checkNotNullParameter(onSourceRemovedListener, "onSourceRemovedListener");
        checkNativeMap$default(this, StubApp.getString2(14023), false, 2, null);
        this.nativeObserver.addOnSourceRemovedListener(onSourceRemovedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeStyleDataLoaded] instead.", replaceWith = @ReplaceWith(expression = "subscribeStyleDataLoaded(styleDataLoadedCallback)", imports = {}))
    public void addOnStyleDataLoadedListener(h7.j onStyleDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14024), false, 2, null);
        this.nativeObserver.addOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeStyleImageMissing] instead.", replaceWith = @ReplaceWith(expression = "subscribeStyleImageMissing(styleImageMissingCallback)", imports = {}))
    public void addOnStyleImageMissingListener(h7.k onStyleImageMissingListener) {
        Intrinsics.checkNotNullParameter(onStyleImageMissingListener, "onStyleImageMissingListener");
        checkNativeMap$default(this, StubApp.getString2(14025), false, 2, null);
        this.nativeObserver.addOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeStyleImageRemoveUnused] instead.", replaceWith = @ReplaceWith(expression = "subscribeStyleImageRemoveUnused(styleImageRemoveUnusedCallback)", imports = {}))
    public void addOnStyleImageUnusedListener(h7.l onStyleImageUnusedListener) {
        Intrinsics.checkNotNullParameter(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        checkNativeMap$default(this, StubApp.getString2(14026), false, 2, null);
        this.nativeObserver.addOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use [subscribeStyleLoaded] instead.", replaceWith = @ReplaceWith(expression = "subscribeStyleLoaded(styleLoadedCallback)", imports = {}))
    public void addOnStyleLoadedListener(m onStyleLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleLoadedListener, "onStyleLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14027), false, 2, null);
        this.nativeObserver.addOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected addViewAnnotation$maps_sdk_release(String viewId, ViewAnnotationOptions options) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(options, "options");
        checkNativeMap$default(this, StubApp.getString2(14028), false, 2, null);
        return this.nativeMap.addViewAnnotation(viewId, options);
    }

    @Override // g7.e
    public Object cameraAnimationsPlugin(Function1<? super Y6.a, ? extends Object> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        Y6.a aVar = this.cameraAnimationsPlugin;
        if (aVar != null) {
            return function.invoke(aVar);
        }
        MapboxLogger.logW(StubApp.getString2(14001), StubApp.getString2(14029));
        return null;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    public CameraOptions cameraForCoordinateBounds(CoordinateBounds bounds, EdgeInsets boundsPadding, Double bearing, Double pitch, Double maxZoom, ScreenCoordinate offset) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        checkNativeMap$default(this, StubApp.getString2(14030), false, 2, null);
        return this.nativeMap.cameraForCoordinateBounds(bounds, boundsPadding, bearing, pitch, maxZoom, offset);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    public CameraOptions cameraForCoordinates(List<Point> coordinates, EdgeInsets coordinatesPadding, Double bearing, Double pitch) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        checkNativeMap$default(this, StubApp.getString2(14031), false, 2, null);
        return this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), coordinatesPadding, bearing, pitch);
    }

    @Override // g7.InterfaceC0962a
    public CameraOptions cameraForDrag(ScreenCoordinate fromPoint, ScreenCoordinate toPoint) {
        Intrinsics.checkNotNullParameter(fromPoint, "fromPoint");
        Intrinsics.checkNotNullParameter(toPoint, "toPoint");
        checkNativeMap$default(this, StubApp.getString2(14032), false, 2, null);
        return this.nativeMap.cameraForDrag(fromPoint, toPoint);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    public CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets geometryPadding, Double bearing, Double pitch) {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        checkNativeMap$default(this, StubApp.getString2(14033), false, 2, null);
        return this.nativeMap.cameraForGeometry(geometry, geometryPadding, bearing, pitch);
    }

    public CoordinateBounds coordinateBoundsForCamera(CameraOptions camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        checkNativeMap$default(this, StubApp.getString2(14034), false, 2, null);
        return this.nativeMap.coordinateBoundsForCamera(camera);
    }

    public CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        checkNativeMap$default(this, StubApp.getString2(14035), false, 2, null);
        return this.nativeMap.coordinateBoundsForCameraUnwrapped(camera);
    }

    public CoordinateBounds coordinateBoundsForRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        checkNativeMap$default(this, StubApp.getString2(14036), false, 2, null);
        if (rectF.isEmpty()) {
            throw new IllegalArgumentException(StubApp.getString2(14037));
        }
        List<Point> coordinatesForPixels = this.nativeMap.coordinatesForPixels(CollectionsKt.mutableListOf(new ScreenCoordinate(rectF.bottom, rectF.left), new ScreenCoordinate(rectF.top, rectF.right)));
        return new CoordinateBounds(coordinatesForPixels.get(0), coordinatesForPixels.get(1));
    }

    public CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        checkNativeMap$default(this, StubApp.getString2(14038), false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCamera(camera);
    }

    public CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        checkNativeMap$default(this, StubApp.getString2(14039), false, 2, null);
        return this.nativeMap.coordinateBoundsZoomForCameraUnwrapped(camera);
    }

    @Override // g7.InterfaceC0962a
    public Point coordinateForPixel(ScreenCoordinate pixel) {
        Intrinsics.checkNotNullParameter(pixel, "pixel");
        checkNativeMap$default(this, StubApp.getString2(14040), false, 2, null);
        return this.nativeMap.coordinateForPixel(pixel);
    }

    public Point coordinateForProjectedMeters(ProjectedMeters projectedMeters) {
        Intrinsics.checkNotNullParameter(projectedMeters, "projectedMeters");
        Point coordinateForProjectedMeters = Projection.coordinateForProjectedMeters(projectedMeters);
        Intrinsics.checkNotNullExpressionValue(coordinateForProjectedMeters, "coordinateForProjectedMeters(projectedMeters)");
        return coordinateForProjectedMeters;
    }

    public CoordinateInfo coordinateInfoForPixel(ScreenCoordinate pixel) {
        Intrinsics.checkNotNullParameter(pixel, "pixel");
        checkNativeMap$default(this, StubApp.getString2(14041), false, 2, null);
        return this.nativeMap.coordinateInfoForPixel(pixel);
    }

    public List<Point> coordinatesForPixels(List<ScreenCoordinate> pixels) {
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        checkNativeMap$default(this, StubApp.getString2(14042), false, 2, null);
        return this.nativeMap.coordinatesForPixels(CollectionsKt.toMutableList((Collection) pixels));
    }

    public List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> pixels) {
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        checkNativeMap$default(this, StubApp.getString2(14043), false, 2, null);
        return this.nativeMap.coordinatesInfoForPixels(pixels);
    }

    @MapboxExperimental
    public final MapboxMapRecorder createRecorder() {
        Expected<String, MapRecorder> createInstance = MapRecorder.createInstance(this.nativeMap.getMap());
        if (createInstance.isValue()) {
            MapRecorder value = createInstance.getValue();
            Intrinsics.checkNotNull(value);
            return new MapboxMapRecorder(value);
        }
        String error = createInstance.getError();
        if (error == null) {
            error = StubApp.getString2(14044);
        }
        throw new RuntimeException(error);
    }

    @Override // g7.c
    @MapboxExperimental
    public void dispatch(PlatformEventInfo platformEventInfo) {
        Intrinsics.checkNotNullParameter(platformEventInfo, "platformEventInfo");
        checkNativeMap$default(this, StubApp.getString2(14045), false, 2, null);
        this.nativeMap.dispatch(platformEventInfo);
    }

    public void executeOnRenderThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        checkNativeMap$default(this, StubApp.getString2(14046), false, 2, null);
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public Object gesturesPlugin(Function1<? super i7.c, ? extends Object> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        i7.c cVar = this.gesturesPlugin;
        if (cVar != null) {
            return function.invoke(cVar);
        }
        MapboxLogger.logW(StubApp.getString2(14001), StubApp.getString2(14047));
        return null;
    }

    public final List<String> getAttributions() {
        checkNativeMap$default(this, StubApp.getString2(14048), false, 2, null);
        return this.nativeMap.getAttributions();
    }

    @Override // g7.InterfaceC0962a
    public CameraBounds getBounds() {
        checkNativeMap$default(this, StubApp.getString2(9391), false, 2, null);
        return this.nativeMap.getBounds();
    }

    /* renamed from: getCameraAnimationsPlugin$maps_sdk_release, reason: from getter */
    public final /* synthetic */ Y6.a getCameraAnimationsPlugin() {
        return this.cameraAnimationsPlugin;
    }

    @Override // g7.InterfaceC0962a
    public CameraState getCameraState() {
        checkNativeMap$default(this, StubApp.getString2(14049), false, 2, null);
        return this.nativeMap.getCameraState();
    }

    @Override // g7.InterfaceC0962a
    public MapCenterAltitudeMode getCenterAltitudeMode() {
        checkNativeMap$default(this, StubApp.getString2(14050), false, 2, null);
        return this.nativeMap.getCenterAltitudeMode();
    }

    @Deprecated(message = "Use `MapView.debugOptions` instead.")
    public final List<MapDebugOptions> getDebug() {
        checkNativeMap$default(this, StubApp.getString2(14051), false, 2, null);
        return this.nativeMap.getDebug();
    }

    public final Set<MapDebugOptions> getDebugOptions$maps_sdk_release() {
        Set<MapDebugOptions> set;
        checkNativeMap$default(this, StubApp.getString2(14051), false, 2, null);
        set = CollectionsKt___CollectionsKt.toSet(this.nativeMap.getDebug());
        return set;
    }

    public final Double getElevation(Point coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        checkNativeMap$default(this, StubApp.getString2(14052), false, 2, null);
        return this.nativeMap.getElevation(coordinate);
    }

    public Cancelable getFeatureState(String sourceId, String sourceLayerId, String featureId, QueryFeatureStateCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14053), false, 2, null);
        return this.nativeMap.getFeatureState(sourceId, sourceLayerId, featureId, callback);
    }

    public FreeCameraOptions getFreeCameraOptions() {
        checkNativeMap$default(this, StubApp.getString2(14055), false, 2, null);
        return this.nativeMap.getFreeCameraOptions();
    }

    public final Cancelable getGeoJsonClusterChildren(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, StubApp.getString2(14006), StubApp.getString2(14002), null, callback);
    }

    public final Cancelable getGeoJsonClusterExpansionZoom(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, StubApp.getString2(14006), StubApp.getString2(14003), null, callback);
    }

    @JvmOverloads
    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, long j, QueryFeatureExtensionCallback queryFeatureExtensionCallback) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(queryFeatureExtensionCallback, StubApp.getString2(696));
        return getGeoJsonClusterLeaves$default(this, sourceIdentifier, cluster, j, 0L, queryFeatureExtensionCallback, 8, null);
    }

    /* renamed from: getGesturesPlugin$maps_sdk_release, reason: from getter */
    public final /* synthetic */ i7.c getGesturesPlugin() {
        return this.gesturesPlugin;
    }

    @Override // g7.h
    public MapOptions getMapOptions() {
        checkNativeMap$default(this, StubApp.getString2(14056), false, 2, null);
        return this.nativeMap.getMapOptions();
    }

    @Override // g7.g
    public double getMetersPerPixelAtLatitude(double latitude, double zoom) {
        return Projection.getMetersPerPixelAtLatitude(latitude, zoom);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final Map getNativeMap() {
        return this.nativeMap.getMap();
    }

    /* renamed from: getNativeObserver$maps_sdk_release, reason: from getter */
    public final /* synthetic */ NativeObserver getNativeObserver() {
        return this.nativeObserver;
    }

    public final byte getPrefetchZoomDelta() {
        checkNativeMap$default(this, StubApp.getString2(14057), false, 2, null);
        return this.nativeMap.getPrefetchZoomDelta();
    }

    /* renamed from: getRenderHandler$maps_sdk_release, reason: from getter */
    public final /* synthetic */ Handler getRenderHandler() {
        return this.renderHandler;
    }

    public final boolean getRenderWorldCopies() {
        checkNativeMap$default(this, StubApp.getString2(14058), false, 2, null);
        return this.nativeMap.getRenderWorldCopies();
    }

    @MapboxExperimental
    public final List<Vec2> getScreenCullingShape() {
        checkNativeMap$default(this, StubApp.getString2(14059), false, 2, null);
        return this.nativeMap.getScreenCullingShape();
    }

    @Override // g7.h
    public Size getSize() {
        checkNativeMap$default(this, StubApp.getString2(14060), false, 2, null);
        return this.nativeMap.getSize();
    }

    /* renamed from: getStyle, reason: merged with bridge method [inline-methods] */
    public final Style getStyleDeprecated() {
        checkNativeMap$default(this, StubApp.getString2(14061), false, 2, null);
        return this.style;
    }

    @MapboxExperimental
    public final HashSet<String> getViewAnnotationAvoidLayers$maps_sdk_release() {
        checkNativeMap$default(this, StubApp.getString2(14062), false, 2, null);
        return this.nativeMap.getViewAnnotationAvoidLayers();
    }

    public final /* synthetic */ Expected getViewAnnotationOptions$maps_sdk_release(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        checkNativeMap$default(this, StubApp.getString2(14063), false, 2, null);
        return this.nativeMap.getViewAnnotationOptions(identifier);
    }

    public boolean isGestureInProgress() {
        checkNativeMap$default(this, StubApp.getString2(14064), false, 2, null);
        return this.nativeMap.isGestureInProgress();
    }

    /* renamed from: isStyleLoadInitiated$maps_sdk_release, reason: from getter */
    public final /* synthetic */ boolean getIsStyleLoadInitiated() {
        return this.isStyleLoadInitiated;
    }

    public boolean isUserAnimationInProgress() {
        checkNativeMap$default(this, StubApp.getString2(14065), false, 2, null);
        return this.nativeMap.isUserAnimationInProgress();
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsMapValid() {
        return this.isMapValid;
    }

    @JvmOverloads
    public final void loadStyle(M6.a styleExtension) {
        Intrinsics.checkNotNullParameter(styleExtension, "styleExtension");
        loadStyle$default(this, styleExtension, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(style, onStyleLoaded)", imports = {}))
    public final void loadStyleJson(String styleJson, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(styleJson, "styleJson");
        loadStyleUri(styleJson, styleTransitionOptions, onStyleLoaded, onMapLoadErrorListener);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(style, onStyleLoaded)", imports = {}))
    public final void loadStyleUri(String styleUri, final TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(styleUri, "styleUri");
        Function1<M6.b, Unit> block = new Function1<M6.b, Unit>() { // from class: com.mapbox.maps.MapboxMap$loadStyleUri$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(M6.b bVar) {
                invoke2(bVar);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(M6.b style) {
                Intrinsics.checkNotNullParameter(style, "$this$style");
                TransitionOptions transitionOptions = TransitionOptions.this;
                if (transitionOptions != null) {
                    TransitionOptions.Builder builder = new TransitionOptions.Builder();
                    transitionOptions.toBuilder();
                    TransitionOptions transition = builder.build();
                    Intrinsics.checkNotNullExpressionValue(transition, "transition");
                    style.getClass();
                    Intrinsics.checkNotNullParameter(transition, "<this>");
                    style.f4675f = transition;
                }
            }
        };
        Intrinsics.checkNotNullParameter(styleUri, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        M6.b bVar = new M6.b(styleUri);
        block.invoke(bVar);
        W6.b.f8168a.increment();
        loadStyle(new C0250h(bVar), onStyleLoaded);
    }

    public final /* synthetic */ void onDestroy$maps_sdk_release() {
        if (this.performanceCollectionStatisticsStarted) {
            stopPerformanceStatisticsCollection();
        }
        this.cameraAnimationsPlugin = null;
        this.gesturesPlugin = null;
        Iterator<T> it = this.interactions.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.interactions.clear();
        this.styleObserver.onDestroy();
        this.isMapValid = false;
    }

    @Override // g7.InterfaceC0962a
    public ScreenCoordinate pixelForCoordinate(Point coordinate) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        checkNativeMap$default(this, StubApp.getString2(14067), false, 2, null);
        return clampScreenCoordinate(this.nativeMap.pixelForCoordinate(coordinate));
    }

    public List<ScreenCoordinate> pixelsForCoordinates(List<Point> coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        checkNativeMap$default(this, StubApp.getString2(14068), false, 2, null);
        List<ScreenCoordinate> pixelsForCoordinates = this.nativeMap.pixelsForCoordinates(CollectionsKt.toMutableList((Collection) coordinates));
        ArrayList arrayList = new ArrayList(CollectionsKt.f(pixelsForCoordinates));
        Iterator<T> it = pixelsForCoordinates.iterator();
        while (it.hasNext()) {
            arrayList.add(clampScreenCoordinate((ScreenCoordinate) it.next()));
        }
        return arrayList;
    }

    @Override // g7.g
    public MercatorCoordinate project(Point point, double zoomScale) {
        Intrinsics.checkNotNullParameter(point, "point");
        MercatorCoordinate project = Projection.project(point, zoomScale);
        Intrinsics.checkNotNullExpressionValue(project, "project(point, zoomScale)");
        return project;
    }

    public ProjectedMeters projectedMetersForCoordinate(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        ProjectedMeters projectedMetersForCoordinate = Projection.projectedMetersForCoordinate(point);
        Intrinsics.checkNotNullExpressionValue(projectedMetersForCoordinate, "projectedMetersForCoordinate(point)");
        return projectedMetersForCoordinate;
    }

    @JvmOverloads
    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, RenderedQueryGeometry renderedQueryGeometry, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return queryRenderedFeatures$default(this, descriptor, renderedQueryGeometry, null, callback, 4, null);
    }

    @Override // g7.b
    public Cancelable querySourceFeatures(String sourceId, SourceQueryOptions options, QuerySourceFeaturesCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap(StubApp.getString2(14070), false);
        return this.nativeMap.querySourceFeatures(sourceId, options, callback);
    }

    public final void reduceMemoryUse() {
        checkNativeMap$default(this, StubApp.getString2(14071), false, 2, null);
        this.nativeMap.reduceMemoryUse();
    }

    @JvmOverloads
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature) {
        Intrinsics.checkNotNullParameter(featuresetFeature, "featuresetFeature");
        return removeFeatureState$default(this, featuresetFeature, null, null, 6, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeCameraChange] to remove the listener.")
    public void removeOnCameraChangeListener(InterfaceC1010a onCameraChangeListener) {
        Intrinsics.checkNotNullParameter(onCameraChangeListener, "onCameraChangeListener");
        checkNativeMap$default(this, StubApp.getString2(14074), false, 2, null);
        this.nativeObserver.removeOnCameraChangeListener(onCameraChangeListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeMapIdle] to remove the listener.")
    public void removeOnMapIdleListener(h7.b onMapIdleListener) {
        Intrinsics.checkNotNullParameter(onMapIdleListener, "onMapIdleListener");
        checkNativeMap$default(this, StubApp.getString2(14075), false, 2, null);
        this.nativeObserver.removeOnMapIdleListener(onMapIdleListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeMapLoadingError] to remove the listener.")
    public void removeOnMapLoadErrorListener(h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(onMapLoadErrorListener, "onMapLoadErrorListener");
        checkNativeMap$default(this, StubApp.getString2(14076), false, 2, null);
        this.nativeObserver.removeOnMapLoadErrorListener(onMapLoadErrorListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeMapLoaded] to remove the listener.")
    public void removeOnMapLoadedListener(h7.d onMapLoadedListener) {
        Intrinsics.checkNotNullParameter(onMapLoadedListener, "onMapLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14077), false, 2, null);
        this.nativeObserver.removeOnMapLoadedListener(onMapLoadedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeRenderFrameFinished] to remove the listener.")
    public void removeOnRenderFrameFinishedListener(h7.e onRenderFrameFinishedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        checkNativeMap$default(this, StubApp.getString2(14078), false, 2, null);
        this.nativeObserver.removeOnRenderFrameFinishedListener(onRenderFrameFinishedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeRenderFrameStarted] to remove the listener.")
    public void removeOnRenderFrameStartedListener(h7.f onRenderFrameStartedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        checkNativeMap$default(this, StubApp.getString2(14079), false, 2, null);
        this.nativeObserver.removeOnRenderFrameStartedListener(onRenderFrameStartedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeSourceAdded] to remove the listener.")
    public void removeOnSourceAddedListener(h7.g onSourceAddedListener) {
        Intrinsics.checkNotNullParameter(onSourceAddedListener, "onSourceAddedListener");
        checkNativeMap$default(this, StubApp.getString2(14080), false, 2, null);
        this.nativeObserver.removeOnSourceAddedListener(onSourceAddedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeSourceDataLoaded] to remove the listener.")
    public void removeOnSourceDataLoadedListener(h7.h onSourceDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14081), false, 2, null);
        this.nativeObserver.removeOnSourceDataLoadedListener(onSourceDataLoadedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeSourceRemoved] to remove the listener.")
    public void removeOnSourceRemovedListener(h7.i onSourceRemovedListener) {
        Intrinsics.checkNotNullParameter(onSourceRemovedListener, "onSourceRemovedListener");
        checkNativeMap$default(this, StubApp.getString2(14082), false, 2, null);
        this.nativeObserver.removeOnSourceRemovedListener(onSourceRemovedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeStyleDataLoaded] to remove the listener.")
    public void removeOnStyleDataLoadedListener(h7.j onStyleDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14083), false, 2, null);
        this.nativeObserver.removeOnStyleDataLoadedListener(onStyleDataLoadedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeStyleImageMissing] to remove the listener.")
    public void removeOnStyleImageMissingListener(h7.k onStyleImageMissingListener) {
        Intrinsics.checkNotNullParameter(onStyleImageMissingListener, "onStyleImageMissingListener");
        checkNativeMap$default(this, StubApp.getString2(14084), false, 2, null);
        this.nativeObserver.removeOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeStyleImageRemoveUnused] to remove the listener.")
    public void removeOnStyleImageUnusedListener(h7.l onStyleImageUnusedListener) {
        Intrinsics.checkNotNullParameter(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        checkNativeMap$default(this, StubApp.getString2(14085), false, 2, null);
        this.nativeObserver.removeOnStyleImageUnusedListener(onStyleImageUnusedListener);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release. use cancelable returned from [subscribeStyleLoaded] to remove the listener.")
    public void removeOnStyleLoadedListener(m onStyleLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleLoadedListener, "onStyleLoadedListener");
        checkNativeMap$default(this, StubApp.getString2(14086), false, 2, null);
        this.nativeObserver.removeOnStyleLoadedListener(onStyleLoadedListener);
    }

    public final /* synthetic */ Expected removeViewAnnotation$maps_sdk_release(String viewId) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        checkNativeMap$default(this, StubApp.getString2(14087), false, 2, null);
        return this.nativeMap.removeViewAnnotation(viewId);
    }

    @JvmOverloads
    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return resetFeatureStates$default(this, descriptor, null, 2, null);
    }

    public Expected<String, None> setBounds(CameraBoundsOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        checkNativeMap$default(this, StubApp.getString2(14089), false, 2, null);
        return this.nativeMap.setBounds(options);
    }

    @Override // g7.InterfaceC0962a
    public void setCamera(CameraOptions cameraOptions) {
        Intrinsics.checkNotNullParameter(cameraOptions, "cameraOptions");
        checkNativeMap$default(this, StubApp.getString2(14090), false, 2, null);
        this.nativeMap.setCamera(cameraOptions);
    }

    @Override // g7.h
    @MapboxExperimental
    public void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        Intrinsics.checkNotNullParameter(cameraAnimationHint, "cameraAnimationHint");
        checkNativeMap$default(this, StubApp.getString2(14091), false, 2, null);
        this.nativeMap.setCameraAnimationHint(cameraAnimationHint);
    }

    public final /* synthetic */ void setCameraAnimationsPlugin$maps_sdk_release(Y6.a aVar) {
        this.cameraAnimationsPlugin = aVar;
    }

    @Override // g7.InterfaceC0962a
    public void setCenterAltitudeMode(MapCenterAltitudeMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        checkNativeMap$default(this, StubApp.getString2(14092), false, 2, null);
        this.nativeMap.setCenterAltitudeMode(mode);
    }

    public void setConstrainMode(ConstrainMode constrainMode) {
        Intrinsics.checkNotNullParameter(constrainMode, "constrainMode");
        checkNativeMap$default(this, StubApp.getString2(14093), false, 2, null);
        this.nativeMap.setConstrainMode(constrainMode);
    }

    @Deprecated(message = "Use `MapView.debugOptions` instead.")
    public final void setDebug(List<? extends MapDebugOptions> debugOptions, boolean enabled) {
        Intrinsics.checkNotNullParameter(debugOptions, "debugOptions");
        checkNativeMap$default(this, StubApp.getString2(14094), false, 2, null);
        this.nativeMap.setDebug(debugOptions, enabled);
    }

    public final void setDebugOptions$maps_sdk_release(Set<? extends MapDebugOptions> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        checkNativeMap$default(this, StubApp.getString2(14094), false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        nativeMapImpl.setDebug(nativeMapImpl.getDebug(), false);
        this.nativeMap.setDebug(CollectionsKt.toList(value), true);
    }

    @JvmOverloads
    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS state) {
        Intrinsics.checkNotNullParameter(featuresetFeature, "featuresetFeature");
        Intrinsics.checkNotNullParameter(state, "state");
        return setFeatureState$default(this, featuresetFeature, state, null, 4, null);
    }

    @Override // g7.h
    public void setGestureInProgress(boolean inProgress) {
        checkNativeMap$default(this, StubApp.getString2(14097), false, 2, null);
        this.nativeMap.setGestureInProgress(inProgress);
    }

    public final /* synthetic */ void setGesturesPlugin$maps_sdk_release(i7.c cVar) {
        this.gesturesPlugin = cVar;
    }

    public void setNorthOrientation(NorthOrientation northOrientation) {
        Intrinsics.checkNotNullParameter(northOrientation, "northOrientation");
        checkNativeMap$default(this, StubApp.getString2(14098), false, 2, null);
        this.nativeMap.setNorthOrientation(northOrientation);
    }

    public final void setPrefetchZoomDelta(byte delta) {
        checkNativeMap$default(this, StubApp.getString2(14099), false, 2, null);
        this.nativeMap.setPrefetchZoomDelta(delta);
    }

    public final /* synthetic */ void setRenderHandler$maps_sdk_release(Handler handler) {
        this.renderHandler = handler;
    }

    public final void setRenderWorldCopies(boolean renderWorldCopies) {
        checkNativeMap$default(this, StubApp.getString2(14100), false, 2, null);
        this.nativeMap.setRenderWorldCopies(renderWorldCopies);
    }

    @MapboxExperimental
    public final void setScreenCullingShape(List<Vec2> shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        checkNativeMap$default(this, StubApp.getString2(14101), false, 2, null);
        this.nativeMap.setScreenCullingShape(shape);
    }

    public final /* synthetic */ void setStyle$maps_sdk_release(Style style) {
        this.style = style;
    }

    public final /* synthetic */ void setStyleLoadInitiated$maps_sdk_release(boolean z2) {
        this.isStyleLoadInitiated = z2;
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        checkNativeMap$default(this, StubApp.getString2(14102), false, 2, null);
        this.nativeMap.setTileCacheBudget(tileCacheBudget);
    }

    @Override // g7.h
    public void setUserAnimationInProgress(boolean inProgress) {
        checkNativeMap$default(this, StubApp.getString2(14103), false, 2, null);
        this.nativeMap.setUserAnimationInProgress(inProgress);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers$maps_sdk_release(HashSet<String> layerIds) {
        checkNativeMap$default(this, StubApp.getString2(14104), false, 2, null);
        return this.nativeMap.setViewAnnotationAvoidLayers(layerIds);
    }

    public final /* synthetic */ void setViewAnnotationPositionsUpdateListener$maps_sdk_release(DelegatingViewAnnotationPositionsUpdateListener listener) {
        checkNativeMap$default(this, StubApp.getString2(14105), false, 2, null);
        this.nativeMap.setViewAnnotationPositionsUpdateListener(listener);
    }

    public void setViewportMode(ViewportMode viewportMode) {
        Intrinsics.checkNotNullParameter(viewportMode, "viewportMode");
        checkNativeMap$default(this, StubApp.getString2(14106), false, 2, null);
        this.nativeMap.setViewportMode(viewportMode);
    }

    @MapboxExperimental
    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions options, PerformanceStatisticsCallback callback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14107), false, 2, null);
        this.nativeMap.startPerformanceStatisticsCollection(options, callback);
        this.performanceCollectionStatisticsStarted = true;
    }

    @MapboxExperimental
    public final void stopPerformanceStatisticsCollection() {
        checkNativeMap$default(this, StubApp.getString2(14108), false, 2, null);
        this.nativeMap.stopPerformanceStatisticsCollection();
        this.performanceCollectionStatisticsStarted = false;
    }

    public Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback) {
        Intrinsics.checkNotNullParameter(cameraChangedCallback, "cameraChangedCallback");
        checkNativeMap$default(this, StubApp.getString2(14109), false, 2, null);
        return NativeObserver.subscribeCameraChanged$default(this.nativeObserver, cameraChangedCallback, null, null, 6, null);
    }

    @Override // g7.d
    public Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        Intrinsics.checkNotNullParameter(cameraChangedCoalescedCallback, "cameraChangedCoalescedCallback");
        checkNativeMap$default(this, StubApp.getString2(14110), false, 2, null);
        return NativeObserver.subscribeCameraChangedCoalesced$default(this.nativeObserver, cameraChangedCoalescedCallback, null, 2, null);
    }

    @MapboxExperimental
    public Cancelable subscribeGenericEvent(String eventName, GenericEventCallback genericEventCallback) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(genericEventCallback, "genericEventCallback");
        checkNativeMap$default(this, StubApp.getString2(14111), false, 2, null);
        return NativeObserver.subscribeGenericEvent$default(this.nativeObserver, eventName, genericEventCallback, null, 4, null);
    }

    public Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback) {
        Intrinsics.checkNotNullParameter(mapIdleCallback, "mapIdleCallback");
        checkNativeMap$default(this, StubApp.getString2(14112), false, 2, null);
        return NativeObserver.subscribeMapIdle$default(this.nativeObserver, mapIdleCallback, null, null, 6, null);
    }

    public Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback) {
        Intrinsics.checkNotNullParameter(mapLoadedCallback, "mapLoadedCallback");
        checkNativeMap$default(this, StubApp.getString2(14113), false, 2, null);
        return NativeObserver.subscribeMapLoaded$default(this.nativeObserver, mapLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        Intrinsics.checkNotNullParameter(mapLoadingErrorCallback, "mapLoadingErrorCallback");
        checkNativeMap$default(this, StubApp.getString2(14114), false, 2, null);
        return NativeObserver.subscribeMapLoadingError$default(this.nativeObserver, mapLoadingErrorCallback, null, null, 6, null);
    }

    public Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        Intrinsics.checkNotNullParameter(renderFrameFinishedCallback, "renderFrameFinishedCallback");
        checkNativeMap$default(this, StubApp.getString2(14115), false, 2, null);
        return NativeObserver.subscribeRenderFrameFinished$default(this.nativeObserver, renderFrameFinishedCallback, null, null, 6, null);
    }

    public Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback) {
        Intrinsics.checkNotNullParameter(renderFrameStartedCallback, "renderFrameStartedCallback");
        checkNativeMap$default(this, StubApp.getString2(14116), false, 2, null);
        return NativeObserver.subscribeRenderFrameStarted$default(this.nativeObserver, renderFrameStartedCallback, null, null, 6, null);
    }

    public Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback) {
        Intrinsics.checkNotNullParameter(resourceRequestCallback, "resourceRequestCallback");
        checkNativeMap$default(this, StubApp.getString2(14117), false, 2, null);
        return NativeObserver.subscribeResourceRequest$default(this.nativeObserver, resourceRequestCallback, null, 2, null);
    }

    public Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback) {
        Intrinsics.checkNotNullParameter(sourceAddedCallback, "sourceAddedCallback");
        checkNativeMap$default(this, StubApp.getString2(14118), false, 2, null);
        return NativeObserver.subscribeSourceAdded$default(this.nativeObserver, sourceAddedCallback, null, null, 6, null);
    }

    public Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback) {
        Intrinsics.checkNotNullParameter(sourceDataLoadedCallback, "sourceDataLoadedCallback");
        checkNativeMap$default(this, StubApp.getString2(14119), false, 2, null);
        return NativeObserver.subscribeSourceDataLoaded$default(this.nativeObserver, sourceDataLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback) {
        Intrinsics.checkNotNullParameter(sourceRemovedCallback, "sourceRemovedCallback");
        checkNativeMap$default(this, StubApp.getString2(14120), false, 2, null);
        return NativeObserver.subscribeSourceRemoved$default(this.nativeObserver, sourceRemovedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        Intrinsics.checkNotNullParameter(styleDataLoadedCallback, "styleDataLoadedCallback");
        checkNativeMap$default(this, StubApp.getString2(14121), false, 2, null);
        return NativeObserver.subscribeStyleDataLoaded$default(this.nativeObserver, styleDataLoadedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        Intrinsics.checkNotNullParameter(styleImageMissingCallback, "styleImageMissingCallback");
        checkNativeMap$default(this, StubApp.getString2(14122), false, 2, null);
        return NativeObserver.subscribeStyleImageMissing$default(this.nativeObserver, styleImageMissingCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        Intrinsics.checkNotNullParameter(styleImageRemoveUnusedCallback, "styleImageRemoveUnusedCallback");
        checkNativeMap$default(this, StubApp.getString2(14123), false, 2, null);
        return NativeObserver.subscribeStyleImageRemoveUnused$default(this.nativeObserver, styleImageRemoveUnusedCallback, null, null, 6, null);
    }

    public Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        Intrinsics.checkNotNullParameter(styleLoadedCallback, "styleLoadedCallback");
        checkNativeMap$default(this, StubApp.getString2(14124), false, 2, null);
        return NativeObserver.subscribeStyleLoaded$default(this.nativeObserver, styleLoadedCallback, null, null, 6, null);
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        Intrinsics.checkNotNullParameter(tileCoverOptions, "tileCoverOptions");
        checkNativeMap$default(this, StubApp.getString2(14125), false, 2, null);
        return this.nativeMap.tileCover(tileCoverOptions, cameraOptions);
    }

    public final void triggerRepaint() {
        checkNativeMap$default(this, StubApp.getString2(14126), false, 2, null);
        this.nativeMap.triggerRepaint();
    }

    @Override // g7.g
    public Point unproject(MercatorCoordinate coordinate, double zoomScale) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        Point unproject = Projection.unproject(coordinate, zoomScale);
        Intrinsics.checkNotNullExpressionValue(unproject, "unproject(coordinate, zoomScale)");
        return unproject;
    }

    public final /* synthetic */ Expected updateViewAnnotation$maps_sdk_release(String viewId, ViewAnnotationOptions options) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(options, "options");
        checkNativeMap$default(this, StubApp.getString2(14127), false, 2, null);
        return this.nativeMap.updateViewAnnotation(viewId, options);
    }

    @MapboxExperimental
    public final void whenSizeReady(Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        checkNativeMap$default(this, StubApp.getString2(14128), false, 2, null);
        this.nativeMap.whenMapSizeReady(action);
    }

    public /* synthetic */ MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMapImpl, nativeObserver, styleObserver);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, M6.a aVar, Style.OnStyleLoaded onStyleLoaded, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            onStyleLoaded = null;
        }
        mapboxMap.loadStyle(aVar, onStyleLoaded);
    }

    public static /* synthetic */ void loadStyleJson$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 4) != 0) {
            cVar = null;
        }
        mapboxMap.loadStyleJson(str, onStyleLoaded, cVar);
    }

    public static /* synthetic */ void loadStyleUri$default(MapboxMap mapboxMap, String str, Style.OnStyleLoaded onStyleLoaded, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 4) != 0) {
            cVar = null;
        }
        mapboxMap.loadStyleUri(str, onStyleLoaded, cVar);
    }

    @JvmOverloads
    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, QueryFeatureExtensionCallback callback) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return getGeoJsonClusterLeaves$default(this, sourceIdentifier, cluster, 0L, 0L, callback, 12, null);
    }

    public double getMetersPerPixelAtLatitude(double latitude) {
        return Projection.getMetersPerPixelAtLatitude(latitude, getCameraState().getZoom());
    }

    @JvmOverloads
    public final void loadStyle(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        loadStyle$default(this, style, (Style.OnStyleLoaded) null, 2, (Object) null);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(style, onStyleLoaded)", imports = {}))
    public final void loadStyleJson(String styleJson, Style.OnStyleLoaded onStyleLoaded, h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(styleJson, "styleJson");
        loadStyleUri(styleJson, null, onStyleLoaded, onMapLoadErrorListener);
    }

    @JvmOverloads
    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return queryRenderedFeatures$default(this, descriptor, null, null, callback, 6, null);
    }

    @JvmOverloads
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK fsk) {
        Intrinsics.checkNotNullParameter(featuresetFeature, "featuresetFeature");
        return removeFeatureState$default(this, featuresetFeature, fsk, null, 4, null);
    }

    public Cancelable resetFeatureStates(String sourceId, String sourceLayerId, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14088), false, 2, null);
        return this.nativeMap.resetFeatureStates(sourceId, sourceLayerId, callback);
    }

    @JvmOverloads
    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id, FS state) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        return setFeatureState$default(this, descriptor, id, state, null, 8, null);
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, StyleObserver styleObserver) {
        super(nativeMapImpl.getMap(), 1.0f, new com.mapbox.common.module.cronet.a(5));
        this.isMapValid = true;
        this.interactions = new ArrayList();
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = styleObserver;
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, M6.a aVar, TransitionOptions transitionOptions, Style.OnStyleLoaded onStyleLoaded, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            transitionOptions = null;
        }
        if ((i3 & 4) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 8) != 0) {
            cVar = null;
        }
        mapboxMap.loadStyle(aVar, transitionOptions, onStyleLoaded, cVar);
    }

    public static /* synthetic */ Cancelable removeFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureStateKey featureStateKey, FeatureStateOperationCallback featureStateOperationCallback, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            featureStateKey = null;
        }
        if ((i3 & 8) != 0) {
            featureStateOperationCallback = new com.mapbox.common.module.cronet.a(8);
        }
        return mapboxMap.removeFeatureState(typedFeaturesetDescriptor, featuresetFeatureId, (FeaturesetFeatureId) featureStateKey, featureStateOperationCallback);
    }

    public static /* synthetic */ Cancelable setFeatureState$default(MapboxMap mapboxMap, TypedFeaturesetDescriptor typedFeaturesetDescriptor, FeaturesetFeatureId featuresetFeatureId, FeatureState featureState, FeatureStateOperationCallback featureStateOperationCallback, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            featureStateOperationCallback = new com.mapbox.common.module.cronet.a(7);
        }
        return mapboxMap.setFeatureState((TypedFeaturesetDescriptor<FeaturesetFeatureId, ?>) typedFeaturesetDescriptor, featuresetFeatureId, (FeaturesetFeatureId) featureState, featureStateOperationCallback);
    }

    public final Cancelable getFeatureState(String sourceId, String featureId, QueryFeatureStateCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return getFeatureState(sourceId, null, featureId, callback);
    }

    @JvmOverloads
    public final Cancelable getGeoJsonClusterLeaves(String sourceIdentifier, Feature cluster, long limit, long offset, QueryFeatureExtensionCallback callback) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.nativeMap.queryFeatureExtensions(sourceIdentifier, cluster, StubApp.getString2(14006), StubApp.getString2(14004), MapsKt.hashMapOf(TuplesKt.to(StubApp.getString2(2106), new Value(limit)), TuplesKt.to(StubApp.getString2(14005), new Value(offset))), callback);
    }

    public final void getStyle(Style.OnStyleLoaded onStyleLoaded) {
        Intrinsics.checkNotNullParameter(onStyleLoaded, "onStyleLoaded");
        Unit unit = null;
        checkNativeMap$default(this, StubApp.getString2(14061), false, 2, null);
        Style styleDeprecated = getStyleDeprecated();
        if (styleDeprecated != null) {
            onStyleLoaded.onStyleLoaded(styleDeprecated);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.styleObserver.addGetStyleListener(onStyleLoaded);
        }
    }

    @JvmOverloads
    public final void loadStyle(String style, Style.OnStyleLoaded onStyleLoaded) {
        Intrinsics.checkNotNullParameter(style, "style");
        checkNativeMap$default(this, StubApp.getString2(14066), false, 2, null);
        initializeStyleLoad$default(this, onStyleLoaded, new h(), null, null, 12, null);
        applyStyle(style);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated.", replaceWith = @ReplaceWith(expression = "loadStyle(style, onStyleLoaded)", imports = {}))
    public final void loadStyleJson(String styleJson, Style.OnStyleLoaded onStyleLoaded) {
        Intrinsics.checkNotNullParameter(styleJson, "styleJson");
        Intrinsics.checkNotNullParameter(onStyleLoaded, "onStyleLoaded");
        loadStyleUri(styleJson, null, onStyleLoaded, null);
    }

    @Override // g7.b
    public Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, RenderedQueryOptions options, QueryRenderedFeaturesCallback callback) {
        Intrinsics.checkNotNullParameter(geometry, "geometry");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap(StubApp.getString2(14069), false);
        return this.nativeMap.queryRenderedFeatures(geometry, options, callback);
    }

    @JvmOverloads
    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(id, "id");
        return removeFeatureState$default(this, descriptor, id, null, null, 12, null);
    }

    public void setCamera(FreeCameraOptions freeCameraOptions) {
        Intrinsics.checkNotNullParameter(freeCameraOptions, "freeCameraOptions");
        checkNativeMap$default(this, StubApp.getString2(14090), false, 2, null);
        this.nativeMap.setCamera(freeCameraOptions);
    }

    public Cancelable setFeatureState(String sourceId, String sourceLayerId, String featureId, Value state, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14095), false, 2, null);
        return this.nativeMap.setFeatureState(sourceId, sourceLayerId, featureId, state, callback);
    }

    public static /* synthetic */ void loadStyle$default(MapboxMap mapboxMap, M6.a aVar, Style.OnStyleLoaded onStyleLoaded, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            onStyleLoaded = null;
        }
        if ((i3 & 4) != 0) {
            cVar = null;
        }
        mapboxMap.loadStyle(aVar, onStyleLoaded, cVar);
    }

    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(FeaturesetFeature<FS> featuresetFeature, FeatureStateCallback<FS> callback) {
        Cancelable featureState;
        Intrinsics.checkNotNullParameter(featuresetFeature, "featuresetFeature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14053), false, 2, null);
        FeaturesetFeatureId id = featuresetFeature.getId();
        if (id != null && (featureState = this.nativeMap.getFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id, new e(featuresetFeature, callback))) != null) {
            return featureState;
        }
        Y6.b bVar = new Y6.b(2);
        MapboxLogger.logE(StubApp.getString2(14001), StubApp.getString2(14054));
        return bVar;
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated.", replaceWith = @ReplaceWith(expression = "loadStyle(style)", imports = {}))
    public final void loadStyleJson(String styleJson) {
        Intrinsics.checkNotNullParameter(styleJson, "styleJson");
        loadStyleUri(styleJson, null, null, null);
    }

    @JvmOverloads
    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id, FSK fsk) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(id, "id");
        return removeFeatureState$default(this, descriptor, id, fsk, null, 8, null);
    }

    public final Cancelable resetFeatureStates(String sourceId, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return resetFeatureStates(sourceId, null, callback);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated", replaceWith = @ReplaceWith(expression = "cameraForCoordinates(coordinates, camera, coordinatesPadding, maxZoom, offset, result)", imports = {}))
    public CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, ScreenBox box) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(box, "box");
        checkNativeMap$default(this, StubApp.getString2(14031), false, 2, null);
        return this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), camera, box);
    }

    @JvmOverloads
    @MapboxExperimental
    public final <FF extends FeaturesetFeature<?>> Cancelable queryRenderedFeatures(TypedFeaturesetDescriptor<?, FF> descriptor, RenderedQueryGeometry geometry, Value filter, QueryRenderedFeaturesetFeaturesCallback<FF> callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14069), false, 2, null);
        NativeMapImpl nativeMapImpl = this.nativeMap;
        if (geometry == null) {
            geometry = RenderedQueryGeometry.valueOf(new ScreenBox(new ScreenCoordinate(0.0d, 0.0d), new ScreenCoordinate(getSize().getWidth(), getSize().getHeight())));
        }
        Intrinsics.checkNotNullExpressionValue(geometry, "geometry ?: RenderedQuer…uble())\n        )\n      )");
        return nativeMapImpl.queryRenderedFeatures(geometry, CollectionsKt.listOf(new FeaturesetQueryTarget(descriptor.toFeaturesetDescriptor(), filter, null)), new f(descriptor, callback));
    }

    public Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, String stateKey, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14072), false, 2, null);
        return this.nativeMap.removeFeatureState(sourceId, sourceLayerId, featureId, stateKey, callback);
    }

    @JvmOverloads
    public final Cancelable resetFeatureStates(TypedFeaturesetDescriptor<?, ?> descriptor, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14088), false, 2, null);
        return this.nativeMap.resetFeatureStates(descriptor.toFeaturesetDescriptor(), callback);
    }

    public final Cancelable setFeatureState(String sourceId, String featureId, Value state, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return setFeatureState(sourceId, null, featureId, state, callback);
    }

    @JvmOverloads
    public final <FS extends FeatureState> Cancelable setFeatureState(FeaturesetFeature<FS> featuresetFeature, FS state, FeatureStateOperationCallback callback) {
        Cancelable featureState;
        Intrinsics.checkNotNullParameter(featuresetFeature, "featuresetFeature");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14095), false, 2, null);
        FeaturesetFeatureId id = featuresetFeature.getId();
        if (id != null && (featureState = this.nativeMap.setFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id, state.getInternalState(), callback)) != null) {
            return featureState;
        }
        Y6.b bVar = new Y6.b(3);
        MapboxLogger.logE(StubApp.getString2(14001), StubApp.getString2(14096));
        return bVar;
    }

    @MapboxDelicateApi
    public CameraOptions cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(camera, "camera");
        checkNativeMap$default(this, StubApp.getString2(14031), false, 2, null);
        if (!this.nativeMap.getSizeSet()) {
            CameraOptions build = new CameraOptions.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().apply(block).build()");
            return build;
        }
        CameraOptions valueOrElse = this.nativeMap.cameraForCoordinates(INSTANCE.calculateBoundingBox(coordinates), camera, coordinatesPadding, maxZoom, offset).getValueOrElse(new i(coordinates, camera, coordinatesPadding, maxZoom, offset, this, 1));
        Intrinsics.checkNotNullExpressionValue(valueOrElse, "nativeMap.cameraForCoord…e cameraOptions { }\n    }");
        return valueOrElse;
    }

    @JvmOverloads
    public final void loadStyle(final M6.a styleExtension, Style.OnStyleLoaded onStyleLoaded) {
        Intrinsics.checkNotNullParameter(styleExtension, "styleExtension");
        final int i3 = 0;
        checkNativeMap$default(this, StubApp.getString2(14066), false, 2, null);
        final int i10 = 1;
        final int i11 = 2;
        initializeStyleLoad(onStyleLoaded, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.g
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i3) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        }, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.g
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i11) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        }, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.g
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                switch (i10) {
                    case 0:
                        MapboxMap.loadStyle$lambda$7(styleExtension, style);
                        break;
                    case 1:
                        MapboxMap.loadStyle$lambda$10(styleExtension, style);
                        break;
                    default:
                        MapboxMap.loadStyle$lambda$13(styleExtension, style);
                        break;
                }
            }
        });
        applyStyle((String) ((C0250h) styleExtension).f6296a);
    }

    public final Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return removeFeatureState(sourceId, sourceLayerId, featureId, null, callback);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(style, onStyleLoaded)", imports = {}))
    public final void loadStyleUri(String styleUri, Style.OnStyleLoaded onStyleLoaded, h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(styleUri, "styleUri");
        loadStyleUri(styleUri, null, onStyleLoaded, onMapLoadErrorListener);
    }

    public final Cancelable removeFeatureState(String sourceId, String featureId, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(featureId, "featureId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return removeFeatureState(sourceId, null, featureId, null, callback);
    }

    private MapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f10) {
        super(nativeMapImpl.getMap(), f10, new B(nativeObserver, 7));
        this.isMapValid = true;
        this.interactions = new ArrayList();
        this.nativeMap = nativeMapImpl;
        this.nativeObserver = nativeObserver;
        this.styleObserver = new StyleObserver(nativeMapImpl.getMap(), new X6.i(this, 2), nativeObserver, f10, new B(this, 8));
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(style, onStyleLoaded)", imports = {}))
    public final void loadStyleUri(String styleUri, Style.OnStyleLoaded onStyleLoaded) {
        Intrinsics.checkNotNullParameter(styleUri, "styleUri");
        Intrinsics.checkNotNullParameter(onStyleLoaded, "onStyleLoaded");
        loadStyleUri(styleUri, null, onStyleLoaded, null);
    }

    @JvmOverloads
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(FeaturesetFeature<FS> featuresetFeature, FSK stateKey, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(featuresetFeature, "featuresetFeature");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14072), false, 2, null);
        FeaturesetFeatureId id = featuresetFeature.getId();
        if (id != null) {
            Cancelable removeFeatureState = this.nativeMap.removeFeatureState(featuresetFeature.getDescriptor().toFeaturesetDescriptor(), id, stateKey != null ? stateKey.getKey() : null, callback);
            if (removeFeatureState != null) {
                return removeFeatureState;
            }
        }
        Y6.b bVar = new Y6.b(4);
        MapboxLogger.logE(StubApp.getString2(14001), StubApp.getString2(14073));
        return bVar;
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(style)", imports = {}))
    public final void loadStyleUri(String styleUri) {
        Intrinsics.checkNotNullParameter(styleUri, "styleUri");
        loadStyleUri(styleUri, null, null, null);
    }

    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable getFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id, FeatureStateCallback<FS> callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14053), false, 2, null);
        return this.nativeMap.getFeatureState(descriptor.toFeaturesetDescriptor(), id, new d(callback, descriptor));
    }

    @Override // g7.InterfaceC0962a
    public void cameraForCoordinates(List<Point> coordinates, CameraOptions camera, EdgeInsets coordinatesPadding, Double maxZoom, ScreenCoordinate offset, Function1<? super CameraOptions, Unit> result) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(result, "result");
        checkNativeMap$default(this, StubApp.getString2(14031), false, 2, null);
        this.nativeMap.whenMapSizeReady(new MapboxMap$cameraForCoordinates$3(result, this, coordinates, camera, coordinatesPadding, maxZoom, offset));
    }

    @JvmOverloads
    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState> Cancelable setFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id, FS state, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14095), false, 2, null);
        return this.nativeMap.setFeatureState(descriptor.toFeaturesetDescriptor(), id, state.getInternalState(), callback);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener and styleTransitionOptions will not be applied anymore, please refer to documentation for new method to understand how to apply them properly.", replaceWith = @ReplaceWith(expression = "loadStyle(styleExtension, onStyleLoaded)", imports = {}))
    public final void loadStyle(M6.a styleExtension, TransitionOptions styleTransitionOptions, Style.OnStyleLoaded onStyleLoaded, h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(styleExtension, "styleExtension");
        loadStyle(styleExtension, onStyleLoaded);
    }

    @Deprecated(message = "Loading style was revisited in v11, this method is deprecated. IMPORTANT: onMapLoadErrorListener will not be triggered anymore, please refer to documentation for new method to understand how to handle errors.", replaceWith = @ReplaceWith(expression = "loadStyle(styleExtension, onStyleLoaded)", imports = {}))
    public final void loadStyle(M6.a styleExtension, Style.OnStyleLoaded onStyleLoaded, h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(styleExtension, "styleExtension");
        loadStyle(styleExtension, onStyleLoaded);
    }

    @JvmOverloads
    @MapboxDelicateApi
    @MapboxExperimental
    public final <FS extends FeatureState, FSK extends FeatureStateKey<FS>> Cancelable removeFeatureState(TypedFeaturesetDescriptor<FS, ?> descriptor, FeaturesetFeatureId id, FSK stateKey, FeatureStateOperationCallback callback) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(callback, "callback");
        checkNativeMap$default(this, StubApp.getString2(14072), false, 2, null);
        return this.nativeMap.removeFeatureState(descriptor.toFeaturesetDescriptor(), id, stateKey != null ? stateKey.getKey() : null, callback);
    }
}
