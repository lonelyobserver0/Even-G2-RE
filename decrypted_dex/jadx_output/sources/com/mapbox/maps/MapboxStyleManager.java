package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016H\u0017J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0007J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0007J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\u0006\u0010/\u001a\u000200H\u0007J.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0017J&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;2\b\u00107\u001a\u0004\u0018\u000108H\u0017J$\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010=\u001a\u00020>H\u0017J.\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0017J$\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010=\u001a\u00020AH\u0017JZ\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00052\u0006\u00101\u001a\u0002022\u0006\u0010/\u001a\u0002002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00162\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00162\b\u0010G\u001a\u0004\u0018\u00010HH\u0017JV\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0017JV\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0017J&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010T\u001a\u00020;2\b\u0010U\u001a\u0004\u0018\u000108H\u0017J$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010W\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\u0012H\u0017J$\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0016H\u0017J\u0010\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\b\u0010_\u001a\u00020\u0012H\u0017J\u0012\u0010`\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020\u0012H\u0017J8\u0010a\u001a*\u0012\u0004\u0012\u00020\u0012\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]0Mj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]`N0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J$\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0017J\u001c\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017J\u001c\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u00104\u001a\u00020\u0012H\u0017J\u0018\u0010f\u001a\u00020]2\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0018\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00170jH\u0017J\u0010\u0010k\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0010\u0010l\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0007J\u0010\u0010m\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0007J\u001c\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J\u0018\u0010o\u001a\u00020]2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0010\u0010p\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\b\u0010q\u001a\u00020rH\u0017J\u0010\u0010s\u001a\u0002002\u0006\u0010,\u001a\u00020\u0012H\u0017J\u0010\u0010t\u001a\u0002002\u0006\u0010W\u001a\u00020\u0012H\u0017J$\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010v\u001a\u00020wH\u0017J$\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010y\u001a\u00020zH\u0017J\u001c\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000%2\u0006\u00104\u001a\u00020\u0012H\u0017J\b\u0010|\u001a\u000200H\u0017J&\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010PH\u0017J&\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u000108H\u0017J3\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0017J\u001d\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u0012H\u0017J\u001d\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J\u001d\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u0012H\u0017J\u001d\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010W\u001a\u00020\u0012H\u0017J\u001d\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J\u001d\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J%\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0017J)\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0017J%\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0017J&\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0017J\n\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0017J\u001d\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010-\u001a\u00020.H\u0017J!\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0017J\u001d\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00101\u001a\u000202H\u0017J\u001e\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0017J4\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010y\u001a\u00020z2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020*0jH\u0017J-\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u0016H\u0017J/\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0017J\u0013\u0010\u0099\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0012H\u0017JB\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122#\u0010\u009c\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0Mj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;`NH\u0017J.\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J%\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J$\u0010\u009f\u0001\u001a\u00030 \u00012\u0006\u00104\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0017J.\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J-\u0010¤\u0001\u001a\u00030 \u00012\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0017J.\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001e\u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0007\u0010§\u0001\u001a\u00020;H\u0017J\u001d\u0010¨\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0007J&\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0007J\u001d\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J%\u0010®\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J.\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010°\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010±\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u0013\u0010²\u0001\u001a\u00030\u008c\u00012\u0007\u0010³\u0001\u001a\u00020rH\u0017J\u0011\u0010´\u0001\u001a\u0002002\u0006\u00104\u001a\u00020\u0012H\u0017J\u0011\u0010µ\u0001\u001a\u0002002\u0006\u0010'\u001a\u00020\u0012H\u0017J3\u0010¶\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016H\u0017J%\u0010·\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0017JM\u0010¸\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`NH\u0017JM\u0010¹\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`NH\u0017R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014¨\u0006º\u0001"}, d2 = {"Lcom/mapbox/maps/MapboxStyleManager;", "", "styleManager", "Lcom/mapbox/maps/StyleManager;", "pixelRatio", "", "mapLoadingErrorDelegate", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "getMapLoadingErrorDelegate", "()Lcom/mapbox/maps/MapLoadingErrorDelegate;", "getPixelRatio", "()F", "styleDefaultCamera", "Lcom/mapbox/maps/CameraOptions;", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "styleJSON", "", "getStyleJSON", "()Ljava/lang/String;", "styleLayers", "", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleLayers", "()Ljava/util/List;", "getStyleManager", "()Lcom/mapbox/maps/StyleManager;", "styleSlots", "getStyleSlots$annotations", "()V", "getStyleSlots", "styleSources", "getStyleSources", "styleURI", "getStyleURI", "addGeoJSONSourceFeatures", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "sourceId", "dataId", "features", "Lcom/mapbox/geojson/Feature;", "addImage", "imageId", "bitmap", "Landroid/graphics/Bitmap;", "sdf", "", "image", "Lcom/mapbox/maps/Image;", "addPersistentStyleCustomLayer", "layerId", "layerHost", "Lcom/mapbox/maps/CustomLayerHost;", "layerPosition", "Lcom/mapbox/maps/LayerPosition;", "addPersistentStyleLayer", "properties", "Lcom/mapbox/bindgen/Value;", "addStyleCustomGeometrySource", "options", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "addStyleCustomLayer", "addStyleCustomRasterSource", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "addStyleImage", "scale", "stretchX", "Lcom/mapbox/maps/ImageStretches;", "stretchY", "content", "Lcom/mapbox/maps/ImageContent;", "addStyleImportFromJSON", "importId", "json", "config", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "importPosition", "Lcom/mapbox/maps/ImportPosition;", "addStyleImportFromURI", "uri", "addStyleLayer", "parameters", "position", "addStyleModel", "modelId", "modelUri", "addStyleSource", "getFeaturesets", "Lcom/mapbox/maps/FeaturesetDescriptor;", "getStyleAtmosphereProperty", "Lcom/mapbox/maps/StylePropertyValue;", "property", "getStyleGlyphURL", "getStyleImage", "getStyleImportConfigProperties", "getStyleImportConfigProperty", "getStyleImportSchema", "getStyleImports", "getStyleLayerProperties", "getStyleLayerProperty", "getStyleLightProperty", "id", "getStyleLights", "", "getStyleProjectionProperty", "getStyleRainProperty", "getStyleSnowProperty", "getStyleSourceProperties", "getStyleSourceProperty", "getStyleTerrainProperty", "getStyleTransition", "Lcom/mapbox/maps/TransitionOptions;", "hasStyleImage", "hasStyleModel", "invalidateStyleCustomGeometrySourceRegion", "coordinateBounds", "Lcom/mapbox/maps/CoordinateBounds;", "invalidateStyleCustomGeometrySourceTile", "tileId", "Lcom/mapbox/maps/CanonicalTileID;", "isStyleLayerPersistent", "isStyleLoaded", "moveStyleImport", "moveStyleLayer", "removeGeoJSONSourceFeatures", "featureIds", "removeStyleImage", "removeStyleImport", "removeStyleLayer", "removeStyleModel", "removeStyleSource", "removeStyleSourceUnchecked", "setImportColorTheme", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", "base64", "setInitialStyleColorTheme", "", "setStyleAtmosphere", "setStyleAtmosphereProperty", "value", "setStyleColorTheme", "setStyleCustomGeometrySourceTileData", "featureCollection", "setStyleCustomRasterSourceTileData", "tiles", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "setStyleGeoJSONSourceData", "data", "Lcom/mapbox/maps/GeoJSONSourceData;", "setStyleGlyphURL", "url", "setStyleImportConfigProperties", "configs", "setStyleImportConfigProperty", "setStyleLayerProperties", "setStyleLayerPropertiesAsync", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "setStyleLayerProperty", "setStyleLayerPropertyAsync", "setStyleLightProperty", "setStyleLights", "lights", "setStyleProjection", "setStyleProjectionProperty", "setStyleRain", "setStyleRainProperty", "setStyleSnow", "setStyleSnowProperty", "setStyleSourceProperties", "setStyleSourceProperty", "setStyleTerrain", "setStyleTerrainProperty", "setStyleTransition", "transitionOptions", "styleLayerExists", "styleSourceExists", "updateGeoJSONSourceFeatures", "updateStyleImageSourceImage", "updateStyleImportWithJSON", "updateStyleImportWithURI", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapboxStyleManager {
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final float pixelRatio;
    private final StyleManager styleManager;

    public MapboxStyleManager(StyleManager styleManager, float f10, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        Intrinsics.checkNotNullParameter(styleManager, "styleManager");
        Intrinsics.checkNotNullParameter(mapLoadingErrorDelegate, "mapLoadingErrorDelegate");
        this.styleManager = styleManager;
        this.pixelRatio = f10;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    public Expected<String, None> addGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(features, "features");
        Expected<String, None> addGeoJSONSourceFeatures = this.styleManager.addGeoJSONSourceFeatures(sourceId, dataId, features);
        Intrinsics.checkNotNullExpressionValue(addGeoJSONSourceFeatures, "styleManager.addGeoJSONS…urceId, dataId, features)");
        return addGeoJSONSourceFeatures;
    }

    public final Expected<String, None> addImage(String imageId, Image image, boolean sdf) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(image, "image");
        return addStyleImage(imageId, this.pixelRatio, image, sdf, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null);
    }

    public Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(layerHost, "layerHost");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addPersistentStyleCustomLayer = this.styleManager.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
        Intrinsics.checkNotNullExpressionValue(addPersistentStyleCustomLayer, "styleManager.addPersiste…layerHost, layerPosition)");
        return addPersistentStyleCustomLayer;
    }

    public Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addPersistentStyleLayer = this.styleManager.addPersistentStyleLayer(properties, layerPosition);
        Intrinsics.checkNotNullExpressionValue(addPersistentStyleLayer, "styleManager.addPersiste…roperties, layerPosition)");
        return addPersistentStyleLayer;
    }

    public Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(options, "options");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleCustomGeometrySource = this.styleManager.addStyleCustomGeometrySource(sourceId, options);
        Intrinsics.checkNotNullExpressionValue(addStyleCustomGeometrySource, "styleManager.addStyleCus…Source(sourceId, options)");
        return addStyleCustomGeometrySource;
    }

    public Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(layerHost, "layerHost");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleCustomLayer = this.styleManager.addStyleCustomLayer(layerId, layerHost, layerPosition);
        Intrinsics.checkNotNullExpressionValue(addStyleCustomLayer, "styleManager.addStyleCus…layerHost, layerPosition)");
        return addStyleCustomLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String sourceId, CustomRasterSourceOptions options) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(options, "options");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleCustomRasterSource = this.styleManager.addStyleCustomRasterSource(sourceId, options);
        Intrinsics.checkNotNullExpressionValue(addStyleCustomRasterSource, "styleManager.addStyleCus…Source(sourceId, options)");
        return addStyleCustomRasterSource;
    }

    public Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(stretchX, "stretchX");
        Intrinsics.checkNotNullParameter(stretchY, "stretchY");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleImage = this.styleManager.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
        Intrinsics.checkNotNullExpressionValue(addStyleImage, "styleManager.addStyleIma…etchX, stretchY, content)");
        return addStyleImage;
    }

    public Expected<String, None> addStyleImportFromJSON(String importId, String json, HashMap<String, Value> config, ImportPosition importPosition) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(json, "json");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleImportFromJSON = this.styleManager.addStyleImportFromJSON(importId, json, config, importPosition);
        Intrinsics.checkNotNullExpressionValue(addStyleImportFromJSON, "styleManager.addStyleImp…, config, importPosition)");
        return addStyleImportFromJSON;
    }

    public Expected<String, None> addStyleImportFromURI(String importId, String uri, HashMap<String, Value> config, ImportPosition importPosition) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleImportFromURI = this.styleManager.addStyleImportFromURI(importId, uri, config, importPosition);
        Intrinsics.checkNotNullExpressionValue(addStyleImportFromURI, "styleManager.addStyleImp…, config, importPosition)");
        return addStyleImportFromURI;
    }

    public Expected<String, None> addStyleLayer(Value parameters, LayerPosition position) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleLayer = this.styleManager.addStyleLayer(parameters, position);
        Intrinsics.checkNotNullExpressionValue(addStyleLayer, "styleManager.addStyleLayer(parameters, position)");
        return addStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleModel(String modelId, String modelUri) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(modelUri, "modelUri");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleModel = this.styleManager.addStyleModel(modelId, modelUri);
        Intrinsics.checkNotNullExpressionValue(addStyleModel, "styleManager.addStyleModel(modelId, modelUri)");
        return addStyleModel;
    }

    public Expected<String, None> addStyleSource(String sourceId, Value properties) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleSource = this.styleManager.addStyleSource(sourceId, properties);
        Intrinsics.checkNotNullExpressionValue(addStyleSource, "styleManager.addStyleSource(sourceId, properties)");
        return addStyleSource;
    }

    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<FeaturesetDescriptor> styleFeaturesets = this.styleManager.getStyleFeaturesets();
        Intrinsics.checkNotNullExpressionValue(styleFeaturesets, "styleManager.styleFeaturesets");
        return styleFeaturesets;
    }

    public final MapLoadingErrorDelegate getMapLoadingErrorDelegate() {
        return this.mapLoadingErrorDelegate;
    }

    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePropertyValue getStyleAtmosphereProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleAtmosphereProperty = this.styleManager.getStyleAtmosphereProperty(property);
        Intrinsics.checkNotNullExpressionValue(styleAtmosphereProperty, "styleManager.getStyleAtmosphereProperty(property)");
        return styleAtmosphereProperty;
    }

    public CameraOptions getStyleDefaultCamera() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        CameraOptions styleDefaultCamera = this.styleManager.getStyleDefaultCamera();
        Intrinsics.checkNotNullExpressionValue(styleDefaultCamera, "styleManager.styleDefaultCamera");
        return styleDefaultCamera;
    }

    @MapboxExperimental
    public String getStyleGlyphURL() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleGlyphURL = this.styleManager.getStyleGlyphURL();
        Intrinsics.checkNotNullExpressionValue(styleGlyphURL, "styleManager.styleGlyphURL");
        return styleGlyphURL;
    }

    public Image getStyleImage(String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.getStyleImage(imageId);
    }

    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String importId) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, HashMap<String, StylePropertyValue>> styleImportConfigProperties = this.styleManager.getStyleImportConfigProperties(importId);
        Intrinsics.checkNotNullExpressionValue(styleImportConfigProperties, "styleManager.getStyleImp…onfigProperties(importId)");
        return styleImportConfigProperties;
    }

    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String importId, String config) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(config, "config");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, StylePropertyValue> styleImportConfigProperty = this.styleManager.getStyleImportConfigProperty(importId, config);
        Intrinsics.checkNotNullExpressionValue(styleImportConfigProperty, "styleManager.getStyleImp…roperty(importId, config)");
        return styleImportConfigProperty;
    }

    public Expected<String, Value> getStyleImportSchema(String importId) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleImportSchema = this.styleManager.getStyleImportSchema(importId);
        Intrinsics.checkNotNullExpressionValue(styleImportSchema, "styleManager.getStyleImportSchema(importId)");
        return styleImportSchema;
    }

    public List<StyleObjectInfo> getStyleImports() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleImports = this.styleManager.getStyleImports();
        Intrinsics.checkNotNullExpressionValue(styleImports, "styleManager.styleImports");
        return styleImports;
    }

    public String getStyleJSON() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleJSON = this.styleManager.getStyleJSON();
        Intrinsics.checkNotNullExpressionValue(styleJSON, "styleManager.styleJSON");
        return styleJSON;
    }

    public Expected<String, Value> getStyleLayerProperties(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleLayerProperties = this.styleManager.getStyleLayerProperties(layerId);
        Intrinsics.checkNotNullExpressionValue(styleLayerProperties, "styleManager.getStyleLayerProperties(layerId)");
        return styleLayerProperties;
    }

    public StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLayerProperty = this.styleManager.getStyleLayerProperty(layerId, property);
        Intrinsics.checkNotNullExpressionValue(styleLayerProperty, "styleManager.getStyleLay…operty(layerId, property)");
        return styleLayerProperty;
    }

    public List<StyleObjectInfo> getStyleLayers() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLayers = this.styleManager.getStyleLayers();
        Intrinsics.checkNotNullExpressionValue(styleLayers, "styleManager.styleLayers");
        return styleLayers;
    }

    public StylePropertyValue getStyleLightProperty(String id, String property) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLightProperty = this.styleManager.getStyleLightProperty(id, property);
        Intrinsics.checkNotNullExpressionValue(styleLightProperty, "styleManager.getStyleLightProperty(id, property)");
        return styleLightProperty;
    }

    public List<StyleObjectInfo> getStyleLights() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLights = this.styleManager.getStyleLights();
        Intrinsics.checkNotNullExpressionValue(styleLights, "styleManager.styleLights");
        return styleLights;
    }

    public final StyleManager getStyleManager() {
        return this.styleManager;
    }

    public StylePropertyValue getStyleProjectionProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleProjectionProperty = this.styleManager.getStyleProjectionProperty(property);
        Intrinsics.checkNotNullExpressionValue(styleProjectionProperty, "styleManager.getStyleProjectionProperty(property)");
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleRainProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleRainProperty = this.styleManager.getStyleRainProperty(property);
        Intrinsics.checkNotNullExpressionValue(styleRainProperty, "styleManager.getStyleRainProperty(property)");
        return styleRainProperty;
    }

    public List<String> getStyleSlots() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<String> styleSlots = this.styleManager.getStyleSlots();
        Intrinsics.checkNotNullExpressionValue(styleSlots, "styleManager.styleSlots");
        return styleSlots;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleSnowProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSnowProperty = this.styleManager.getStyleSnowProperty(property);
        Intrinsics.checkNotNullExpressionValue(styleSnowProperty, "styleManager.getStyleSnowProperty(property)");
        return styleSnowProperty;
    }

    public Expected<String, Value> getStyleSourceProperties(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleSourceProperties = this.styleManager.getStyleSourceProperties(sourceId);
        Intrinsics.checkNotNullExpressionValue(styleSourceProperties, "styleManager.getStyleSourceProperties(sourceId)");
        return styleSourceProperties;
    }

    public StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSourceProperty = this.styleManager.getStyleSourceProperty(sourceId, property);
        Intrinsics.checkNotNullExpressionValue(styleSourceProperty, "styleManager.getStyleSou…perty(sourceId, property)");
        return styleSourceProperty;
    }

    public List<StyleObjectInfo> getStyleSources() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleSources = this.styleManager.getStyleSources();
        Intrinsics.checkNotNullExpressionValue(styleSources, "styleManager.styleSources");
        return styleSources;
    }

    public StylePropertyValue getStyleTerrainProperty(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleTerrainProperty = this.styleManager.getStyleTerrainProperty(property);
        Intrinsics.checkNotNullExpressionValue(styleTerrainProperty, "styleManager.getStyleTerrainProperty(property)");
        return styleTerrainProperty;
    }

    public TransitionOptions getStyleTransition() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        TransitionOptions styleTransition = this.styleManager.getStyleTransition();
        Intrinsics.checkNotNullExpressionValue(styleTransition, "styleManager.styleTransition");
        return styleTransition;
    }

    public String getStyleURI() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleURI = this.styleManager.getStyleURI();
        Intrinsics.checkNotNullExpressionValue(styleURI, "styleManager.styleURI");
        return styleURI;
    }

    public boolean hasStyleImage(String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleImage(imageId);
    }

    @MapboxExperimental
    public boolean hasStyleModel(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleModel(modelId);
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(coordinateBounds, "coordinateBounds");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> invalidateStyleCustomGeometrySourceRegion = this.styleManager.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
        Intrinsics.checkNotNullExpressionValue(invalidateStyleCustomGeometrySourceRegion, "styleManager.invalidateS…urceId, coordinateBounds)");
        return invalidateStyleCustomGeometrySourceRegion;
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> invalidateStyleCustomGeometrySourceTile = this.styleManager.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
        Intrinsics.checkNotNullExpressionValue(invalidateStyleCustomGeometrySourceTile, "styleManager.invalidateS…rceTile(sourceId, tileId)");
        return invalidateStyleCustomGeometrySourceTile;
    }

    public Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Boolean> isStyleLayerPersistent = this.styleManager.isStyleLayerPersistent(layerId);
        Intrinsics.checkNotNullExpressionValue(isStyleLayerPersistent, "styleManager.isStyleLayerPersistent(layerId)");
        return isStyleLayerPersistent;
    }

    public boolean isStyleLoaded() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.isStyleLoaded();
    }

    public Expected<String, None> moveStyleImport(String importId, ImportPosition importPosition) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> moveStyleImport = this.styleManager.moveStyleImport(importId, importPosition);
        Intrinsics.checkNotNullExpressionValue(moveStyleImport, "styleManager.moveStyleIm…importId, importPosition)");
        return moveStyleImport;
    }

    public Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> moveStyleLayer = this.styleManager.moveStyleLayer(layerId, layerPosition);
        Intrinsics.checkNotNullExpressionValue(moveStyleLayer, "styleManager.moveStyleLa…r(layerId, layerPosition)");
        return moveStyleLayer;
    }

    public Expected<String, None> removeGeoJSONSourceFeatures(String sourceId, String dataId, List<String> featureIds) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(featureIds, "featureIds");
        Expected<String, None> removeGeoJSONSourceFeatures = this.styleManager.removeGeoJSONSourceFeatures(sourceId, dataId, featureIds);
        Intrinsics.checkNotNullExpressionValue(removeGeoJSONSourceFeatures, "styleManager.removeGeoJS…ceId, dataId, featureIds)");
        return removeGeoJSONSourceFeatures;
    }

    public Expected<String, None> removeStyleImage(String imageId) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleImage = this.styleManager.removeStyleImage(imageId);
        Intrinsics.checkNotNullExpressionValue(removeStyleImage, "styleManager.removeStyleImage(imageId)");
        return removeStyleImage;
    }

    public Expected<String, None> removeStyleImport(String importId) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleImport = this.styleManager.removeStyleImport(importId);
        Intrinsics.checkNotNullExpressionValue(removeStyleImport, "styleManager.removeStyleImport(importId)");
        return removeStyleImport;
    }

    public Expected<String, None> removeStyleLayer(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleLayer = this.styleManager.removeStyleLayer(layerId);
        Intrinsics.checkNotNullExpressionValue(removeStyleLayer, "styleManager.removeStyleLayer(layerId)");
        return removeStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleModel = this.styleManager.removeStyleModel(modelId);
        Intrinsics.checkNotNullExpressionValue(removeStyleModel, "styleManager.removeStyleModel(modelId)");
        return removeStyleModel;
    }

    public Expected<String, None> removeStyleSource(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleSource = this.styleManager.removeStyleSource(sourceId);
        Intrinsics.checkNotNullExpressionValue(removeStyleSource, "styleManager.removeStyleSource(sourceId)");
        return removeStyleSource;
    }

    public Expected<String, None> removeStyleSourceUnchecked(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleSourceUnchecked = this.styleManager.removeStyleSourceUnchecked(sourceId);
        Intrinsics.checkNotNullExpressionValue(removeStyleSourceUnchecked, "styleManager.removeStyleSourceUnchecked(sourceId)");
        return removeStyleSourceUnchecked;
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, ColorTheme colorTheme) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> importColorTheme = this.styleManager.setImportColorTheme(importId, colorTheme);
        Intrinsics.checkNotNullExpressionValue(importColorTheme, "styleManager.setImportCo…eme(importId, colorTheme)");
        return importColorTheme;
    }

    @MapboxExperimental
    public void setInitialStyleColorTheme() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setInitialStyleColorTheme();
    }

    public Expected<String, None> setStyleAtmosphere(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphere = this.styleManager.setStyleAtmosphere(properties);
        Intrinsics.checkNotNullExpressionValue(styleAtmosphere, "styleManager.setStyleAtmosphere(properties)");
        return styleAtmosphere;
    }

    public Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphereProperty = this.styleManager.setStyleAtmosphereProperty(property, value);
        Intrinsics.checkNotNullExpressionValue(styleAtmosphereProperty, "styleManager.setStyleAtm…Property(property, value)");
        return styleAtmosphereProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleColorTheme = this.styleManager.setStyleColorTheme(colorTheme);
        Intrinsics.checkNotNullExpressionValue(styleColorTheme, "styleManager.setStyleColorTheme(colorTheme)");
        return styleColorTheme;
    }

    public Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(tileId, "tileId");
        Intrinsics.checkNotNullParameter(featureCollection, "featureCollection");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomGeometrySourceTileData = this.styleManager.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
        Intrinsics.checkNotNullExpressionValue(styleCustomGeometrySourceTileData, "styleManager.setStyleCus…ileId, featureCollection)");
        return styleCustomGeometrySourceTileData;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String sourceId, List<CustomRasterSourceTileData> tiles) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomRasterSourceTileData = this.styleManager.setStyleCustomRasterSourceTileData(sourceId, tiles);
        Intrinsics.checkNotNullExpressionValue(styleCustomRasterSourceTileData, "styleManager.setStyleCus…TileData(sourceId, tiles)");
        return styleCustomRasterSourceTileData;
    }

    public Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        Expected<String, None> styleGeoJSONSourceData = this.styleManager.setStyleGeoJSONSourceData(sourceId, dataId, data);
        Intrinsics.checkNotNullExpressionValue(styleGeoJSONSourceData, "styleManager.setStyleGeo…a(sourceId, dataId, data)");
        return styleGeoJSONSourceData;
    }

    @MapboxExperimental
    public void setStyleGlyphURL(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleGlyphURL(url);
    }

    public Expected<String, None> setStyleImportConfigProperties(String importId, HashMap<String, Value> configs) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(configs, "configs");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperties = this.styleManager.setStyleImportConfigProperties(importId, configs);
        Intrinsics.checkNotNullExpressionValue(styleImportConfigProperties, "styleManager.setStyleImp…erties(importId, configs)");
        return styleImportConfigProperties;
    }

    public Expected<String, None> setStyleImportConfigProperty(String importId, String config, Value value) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperty = this.styleManager.setStyleImportConfigProperty(importId, config, value);
        Intrinsics.checkNotNullExpressionValue(styleImportConfigProperty, "styleManager.setStyleImp…(importId, config, value)");
        return styleImportConfigProperty;
    }

    public Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperties = this.styleManager.setStyleLayerProperties(layerId, properties);
        Intrinsics.checkNotNullExpressionValue(styleLayerProperties, "styleManager.setStyleLay…ties(layerId, properties)");
        return styleLayerProperties;
    }

    @MapboxExperimental
    public Cancelable setStyleLayerPropertiesAsync(String layerId, Value properties, AsyncOperationResultCallback callback) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Cancelable styleLayerPropertiesAsync = this.styleManager.setStyleLayerPropertiesAsync(layerId, properties, callback);
        Intrinsics.checkNotNullExpressionValue(styleLayerPropertiesAsync, "styleManager.setStyleLay…Id, properties, callback)");
        return styleLayerPropertiesAsync;
    }

    public Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperty = this.styleManager.setStyleLayerProperty(layerId, property, value);
        Intrinsics.checkNotNullExpressionValue(styleLayerProperty, "styleManager.setStyleLay…layerId, property, value)");
        return styleLayerProperty;
    }

    @MapboxExperimental
    public Cancelable setStyleLayerPropertyAsync(String layerId, String property, Value value, AsyncOperationResultCallback callback) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Cancelable styleLayerPropertyAsync = this.styleManager.setStyleLayerPropertyAsync(layerId, property, value, callback);
        Intrinsics.checkNotNullExpressionValue(styleLayerPropertyAsync, "styleManager.setStyleLay…roperty, value, callback)");
        return styleLayerPropertyAsync;
    }

    public Expected<String, None> setStyleLightProperty(String id, String property, Value value) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLightProperty = this.styleManager.setStyleLightProperty(id, property, value);
        Intrinsics.checkNotNullExpressionValue(styleLightProperty, "styleManager.setStyleLig…erty(id, property, value)");
        return styleLightProperty;
    }

    public Expected<String, None> setStyleLights(Value lights) {
        Intrinsics.checkNotNullParameter(lights, "lights");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLights = this.styleManager.setStyleLights(lights);
        Intrinsics.checkNotNullExpressionValue(styleLights, "styleManager.setStyleLights(lights)");
        return styleLights;
    }

    public Expected<String, None> setStyleProjection(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjection = this.styleManager.setStyleProjection(properties);
        Intrinsics.checkNotNullExpressionValue(styleProjection, "styleManager.setStyleProjection(properties)");
        return styleProjection;
    }

    public Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjectionProperty = this.styleManager.setStyleProjectionProperty(property, value);
        Intrinsics.checkNotNullExpressionValue(styleProjectionProperty, "styleManager.setStylePro…Property(property, value)");
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRain(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRain = this.styleManager.setStyleRain(properties);
        Intrinsics.checkNotNullExpressionValue(styleRain, "styleManager.setStyleRain(properties)");
        return styleRain;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRainProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRainProperty = this.styleManager.setStyleRainProperty(property, value);
        Intrinsics.checkNotNullExpressionValue(styleRainProperty, "styleManager.setStyleRainProperty(property, value)");
        return styleRainProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnow(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnow = this.styleManager.setStyleSnow(properties);
        Intrinsics.checkNotNullExpressionValue(styleSnow, "styleManager.setStyleSnow(properties)");
        return styleSnow;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnowProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnowProperty = this.styleManager.setStyleSnowProperty(property, value);
        Intrinsics.checkNotNullExpressionValue(styleSnowProperty, "styleManager.setStyleSnowProperty(property, value)");
        return styleSnowProperty;
    }

    public Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperties = this.styleManager.setStyleSourceProperties(sourceId, properties);
        Intrinsics.checkNotNullExpressionValue(styleSourceProperties, "styleManager.setStyleSou…ies(sourceId, properties)");
        return styleSourceProperties;
    }

    public Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(sourceId, property, value);
        Intrinsics.checkNotNullExpressionValue(styleSourceProperty, "styleManager.setStyleSou…ourceId, property, value)");
        return styleSourceProperty;
    }

    public Expected<String, None> setStyleTerrain(Value properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrain = this.styleManager.setStyleTerrain(properties);
        Intrinsics.checkNotNullExpressionValue(styleTerrain, "styleManager.setStyleTerrain(properties)");
        return styleTerrain;
    }

    public Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrainProperty = this.styleManager.setStyleTerrainProperty(property, value);
        Intrinsics.checkNotNullExpressionValue(styleTerrainProperty, "styleManager.setStyleTer…Property(property, value)");
        return styleTerrainProperty;
    }

    public void setStyleTransition(TransitionOptions transitionOptions) {
        Intrinsics.checkNotNullParameter(transitionOptions, "transitionOptions");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleTransition(transitionOptions);
    }

    public boolean styleLayerExists(String layerId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleLayerExists(layerId);
    }

    public boolean styleSourceExists(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleSourceExists(sourceId);
    }

    public Expected<String, None> updateGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(features, "features");
        Expected<String, None> updateGeoJSONSourceFeatures = this.styleManager.updateGeoJSONSourceFeatures(sourceId, dataId, features);
        Intrinsics.checkNotNullExpressionValue(updateGeoJSONSourceFeatures, "styleManager.updateGeoJS…urceId, dataId, features)");
        return updateGeoJSONSourceFeatures;
    }

    public Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(image, "image");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> updateStyleImageSourceImage = this.styleManager.updateStyleImageSourceImage(sourceId, image);
        Intrinsics.checkNotNullExpressionValue(updateStyleImageSourceImage, "styleManager.updateStyle…rceImage(sourceId, image)");
        return updateStyleImageSourceImage;
    }

    public Expected<String, None> updateStyleImportWithJSON(String importId, String json, HashMap<String, Value> config) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(json, "json");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> updateStyleImportWithJSON = this.styleManager.updateStyleImportWithJSON(importId, json, config);
        Intrinsics.checkNotNullExpressionValue(updateStyleImportWithJSON, "styleManager.updateStyle…ortId, json, config\n    )");
        return updateStyleImportWithJSON;
    }

    public Expected<String, None> updateStyleImportWithURI(String importId, String uri, HashMap<String, Value> config) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> updateStyleImportWithURI = this.styleManager.updateStyleImportWithURI(importId, uri, config);
        Intrinsics.checkNotNullExpressionValue(updateStyleImportWithURI, "styleManager.updateStyle…RI(importId, uri, config)");
        return updateStyleImportWithURI;
    }

    public final Expected<String, None> addImage(String imageId, Image image) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(image, "image");
        return addImage(imageId, image, false);
    }

    public final Expected<String, None> addImage(String imageId, Bitmap bitmap, boolean sdf) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return addImage(imageId, ExtensionUtils.toMapboxImage(bitmap), sdf);
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, String base64) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return setImportColorTheme(importId, ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        return setStyleColorTheme(ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    public final Expected<String, None> addImage(String imageId, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return addImage(imageId, bitmap, false);
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return setImportColorTheme(importId, ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return setStyleColorTheme(ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Image image) {
        Intrinsics.checkNotNullParameter(importId, "importId");
        Intrinsics.checkNotNullParameter(image, "image");
        return setImportColorTheme(importId, ColorTheme.valueOf(image));
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return setStyleColorTheme(ColorTheme.valueOf(image));
    }
}
