package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010(\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\u001aO\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a!\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001a6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\fj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b¢\u0006\u0002\u0010\u000e\u001a_\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\fj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\u000f\u001a6\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0012\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b¢\u0006\u0002\u0010\u0013\u001a_\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0012\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\u0014\u001aX\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032%\b\u0001\u0010\u0016\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a`\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2%\b\u0001\u0010\u0016\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a'\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b\u001a:\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a3\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u001aL\u0010 \u001a\u0002H!\"\u0014\b\u0000\u0010\"*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010%\u001a9\u0010&\u001a\u00020\u001d\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010)\u001a;\u0010*\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010+\u001a:\u0010,\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u00022\u0006\u0010-\u001a\u0002H\u0003H\u0087\n¢\u0006\u0002\u0010.\u001a1\u0010/\u001a\u00020\u001d\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'*\u000e\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010)\u001a7\u00100\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\t\b\u0001\u0010\u0003¢\u0006\u0002\b'*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010-\u001a\u0002H\u0003H\u0087\b¢\u0006\u0002\u0010)\u001a;\u00101\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010+\u001a*\u00102\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0087\n¢\u0006\u0002\u00104\u001a*\u00105\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0087\n¢\u0006\u0002\u00104\u001a1\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0087\b\u001aP\u00107\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00030$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0002\u00108\u001aC\u00109\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00030$H\u0080\bø\u0001\u0000¢\u0006\u0002\u00108\u001a1\u0010:\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010+\u001aC\u0010;\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00030$H\u0086\bø\u0001\u0000¢\u0006\u0002\u00108\u001a9\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003030=\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a<\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030?0>\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\nH\u0087\n¢\u0006\u0002\b@\u001aw\u0010A\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!\"\u0018\b\u0003\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H!0\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aw\u0010E\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!\"\u0018\b\u0003\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H!\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aG\u0010F\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006¢\u0006\u0002\u0010G\u001a@\u0010F\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070H\u001a@\u0010F\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070I\u001a\\\u0010J\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000\u001a\\\u0010K\u001a\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000\u001aJ\u0010L\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001aJ\u0010N\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001aq\u0010O\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aV\u0010P\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001aq\u0010Q\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aV\u0010R\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001a4\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070H\u001aO\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070H2\u0006\u0010B\u001a\u0002H\"¢\u0006\u0002\u0010T\u001a;\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006¢\u0006\u0002\u0010\b\u001aQ\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u00062\u0006\u0010B\u001a\u0002H\"¢\u0006\u0002\u0010U\u001a4\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070I\u001aO\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070I2\u0006\u0010B\u001a\u0002H\"¢\u0006\u0002\u0010V\u001a2\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a2\u0010W\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aM\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"H\u0007¢\u0006\u0002\u0010X\u001aG\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0086\u0002\u001aM\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070HH\u0086\u0002\u001aT\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006H\u0086\u0002¢\u0006\u0002\u0010[\u001aM\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070IH\u0086\u0002\u001aI\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010\\\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001a=\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\n\u001aC\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070HH\u0087\n\u001aJ\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006H\u0087\n¢\u0006\u0002\u0010G\u001aC\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070IH\u0087\n\u001a=\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a@\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\u0002¢\u0006\u0002\u0010_\u001aA\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020HH\u0087\u0002\u001aH\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0087\u0002¢\u0006\u0002\u0010a\u001aA\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020IH\u0087\u0002\u001a2\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010c\u001a3\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020HH\u0087\n\u001a:\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0087\n¢\u0006\u0002\u0010d\u001a3\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020IH\u0087\n\u001a0\u0010e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, d2 = {"emptyMap", "", "K", "V", "mapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "()Ljava/util/HashMap;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "()Ljava/util/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "buildMap", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "isNotEmpty", "", "isNullOrEmpty", "orEmpty", "ifEmpty", "R", "M", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contains", "Lkotlin/internal/OnlyInputTypes;", "key", "(Ljava/util/Map;Ljava/lang/Object;)Z", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "set", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "containsKey", "containsValue", "remove", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "toPair", "getOrElse", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getValue", "getOrPut", "iterator", "", "", "", "mutableIterator", "mapValuesTo", "destination", "transform", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "mapKeysTo", "putAll", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "Lkotlin/sequences/Sequence;", "mapValues", "mapKeys", "filterKeys", "predicate", "filterValues", "filterTo", "filter", "filterNotTo", "filterNot", "toMap", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "plus", "pair", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "map", "plusAssign", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "minusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,814:1\n413#1:824\n424#1:829\n521#1,6:834\n546#1,6:840\n1#2:815\n1252#3,4:816\n1252#3,4:820\n1252#3,4:825\n1252#3,4:830\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n463#1:824\n478#1:829\n536#1:834,6\n561#1:840,6\n413#1:816,4\n424#1:820,4\n463#1:825,4\n478#1:830,4\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <K, V> Map<K, V> buildMap(@BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        builderAction.invoke(createMapBuilder);
        return MapsKt__MapsJVMKt.build(createMapBuilder);
    }

    @InlineOnly
    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @InlineOnly
    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @InlineOnly
    private static final <K, V> boolean contains(Map<? extends K, ? extends V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsKey(k3);
    }

    @InlineOnly
    private static final <K> boolean containsKey(Map<? extends K, ?> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsKey(k3);
    }

    @InlineOnly
    private static final <K, V> boolean containsValue(Map<K, ? extends V> map, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsValue(v2);
    }

    public static <K, V> Map<K, V> emptyMap() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        Intrinsics.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final <K, V> Map<K, V> filter(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterKeys(Map<? extends K, ? extends V> map, Function1<? super K, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> filterNot(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    public static final <K, V> Map<K, V> filterValues(Map<? extends K, ? extends V> map, Function1<? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> V get(Map<? extends K, ? extends V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.get(k3);
    }

    @InlineOnly
    private static final <K, V> V getOrElse(Map<K, ? extends V> map, K k3, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = map.get(k3);
        return v2 == null ? defaultValue.invoke() : v2;
    }

    public static final <K, V> V getOrElseNullable(Map<K, ? extends V> map, K k3, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = map.get(k3);
        return (v2 != null || map.containsKey(k3)) ? v2 : defaultValue.invoke();
    }

    public static final <K, V> V getOrPut(Map<K, V> map, K k3, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = map.get(k3);
        if (v2 != null) {
            return v2;
        }
        V invoke = defaultValue.invoke();
        map.put(k3, invoke);
        return invoke;
    }

    @SinceKotlin(version = "1.1")
    public static <K, V> V getValue(Map<K, ? extends V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) MapsKt__MapWithDefaultKt.getOrImplicitDefaultNullable(map, k3);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap<>();
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Map map, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    @InlineOnly
    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @InlineOnly
    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapKeys(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    public static <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return pairs.length > 0 ? toMap(pairs, new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairs.length))) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<K, R> mapValues(Map<? extends K, ? extends V> map, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(Map<? extends K, ? extends V> map, M destination, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map mutableMap = toMutableMap(map);
        mutableMap.remove(k3);
        return optimizeReadOnlyMap(mutableMap);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.remove(k3);
    }

    @InlineOnly
    @JvmName(name = "mutableIterator")
    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : MapsKt__MapsJVMKt.toSingletonMap(map) : emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> map) {
        return map == 0 ? emptyMap() : map;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return MapsKt__MapsJVMKt.mapOf(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @InlineOnly
    private static final <K, V> V remove(Map<? extends K, V> map, K k3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return (V) TypeIntrinsics.asMutableMap(map).remove(k3);
    }

    @InlineOnly
    private static final <K, V> void set(Map<K, V> map, K k3, V v2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.put(k3, v2);
    }

    public static <K, V> Map<K, V> toMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return optimizeReadOnlyMap(toMap(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMap(iterable, new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(collection.size())));
        }
        return MapsKt__MapsJVMKt.mapOf((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    @SinceKotlin(version = "1.1")
    public static <K, V> Map<K, V> toMutableMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    @InlineOnly
    private static final <K, V> Pair<K, V> toPair(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <K, V> Map<K, V> buildMap(int i3, @BuilderInference Function1<? super Map<K, V>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Map createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder(i3);
        builderAction.invoke(createMapBuilder);
        return MapsKt__MapsJVMKt.build(createMapBuilder);
    }

    public static <K, V> HashMap<K, V> hashMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(MapsKt__MapsJVMKt.mapCapacity(pairs.length));
        putAll(hashMap, pairs);
        return hashMap;
    }

    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return (LinkedHashMap) toMap(pairs, new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairs.length)));
    }

    @InlineOnly
    private static final <K, V> Map<K, V> mapOf() {
        return emptyMap();
    }

    @SinceKotlin(version = "1.1")
    public static <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map mutableMap = toMutableMap(map);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> map, Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt__MutableCollectionsKt.removeAll(map.keySet(), keys);
    }

    public static <K, V> Map<K, V> mutableMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairs.length));
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            return toMap(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(map, pairs);
    }

    @SinceKotlin(version = "1.1")
    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, K[] keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map mutableMap = toMutableMap(map);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> map, K[] keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt__MutableCollectionsKt.removeAll(map.keySet(), keys);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (map.isEmpty()) {
            return toMap(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(map, pairs);
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @SinceKotlin(version = "1.1")
    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> map, Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Map mutableMap = toMutableMap(map);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableMap.keySet(), keys);
        return optimizeReadOnlyMap(mutableMap);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <K, V> void minusAssign(Map<K, V> map, Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        CollectionsKt__MutableCollectionsKt.removeAll(map.keySet(), keys);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        putAll(linkedHashMap, pairs);
        return optimizeReadOnlyMap(linkedHashMap);
    }

    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(map, pairs);
    }

    public static <K, V> Map<K, V> plus(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <K, V> void plusAssign(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        map.putAll(map2);
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> map, Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        putAll(destination, iterable);
        return destination;
    }

    public static final <K, V> Map<K, V> toMap(Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            return emptyMap();
        }
        if (length != 1) {
            return toMap(pairArr, new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(pairArr.length)));
        }
        return MapsKt__MapsJVMKt.mapOf(pairArr[0]);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        putAll(destination, pairArr);
        return destination;
    }

    public static final <K, V> Map<K, V> toMap(Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return optimizeReadOnlyMap(toMap(sequence, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Sequence<? extends Pair<? extends K, ? extends V>> sequence, M destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        putAll(destination, sequence);
        return destination;
    }

    @SinceKotlin(version = "1.1")
    public static <K, V> Map<K, V> toMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return emptyMap();
        }
        if (size != 1) {
            return toMutableMap(map);
        }
        return MapsKt__MapsJVMKt.toSingletonMap(map);
    }

    @SinceKotlin(version = "1.1")
    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Map<? extends K, ? extends V> map, M destination) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.putAll(map);
        return destination;
    }
}
