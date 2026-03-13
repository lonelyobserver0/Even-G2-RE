package J1;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.microsoft.cognitiveservices.speech.transcription.Conversation;
import com.microsoft.cognitiveservices.speech.transcription.ConversationTranscriber;
import com.microsoft.cognitiveservices.speech.transcription.ConversationTranslator;
import com.microsoft.cognitiveservices.speech.transcription.Meeting;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import l4.CallableC1207q0;
import p.C1476b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3329b;

    public /* synthetic */ l(Object obj, int i3) {
        this.f3328a = i3;
        this.f3329b = obj;
    }

    public Set a() {
        m mVar = (m) this.f3329b;
        Set createSetBuilder = SetsKt.createSetBuilder();
        Cursor m4 = mVar.f3331a.m(new O1.a(StubApp.getString2(2905), 0));
        while (m4.moveToNext()) {
            try {
                createSetBuilder.add(Integer.valueOf(m4.getInt(0)));
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(m4, null);
        Set build = SetsKt.build(createSetBuilder);
        if (build.isEmpty()) {
            return build;
        }
        P1.k kVar = ((m) this.f3329b).f3337g;
        String string2 = StubApp.getString2(2906);
        if (kVar == null) {
            throw new IllegalStateException(string2);
        }
        P1.k kVar2 = ((m) this.f3329b).f3337g;
        if (kVar2 == null) {
            throw new IllegalArgumentException(string2);
        }
        kVar2.d();
        return build;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set emptySet;
        long startConversation;
        long deleteConversation;
        long lockConversation;
        long unlockConversation;
        long muteAll;
        long unmuteAll;
        long muteParticipant;
        long unmuteParticipant;
        long addParticipant;
        long addParticipantByUser;
        long removeParticipantByUser;
        long removeParticipant;
        long removeParticipantByUserId;
        long endConversation;
        long joinConversation;
        long joinConversationId;
        long leaveConversation;
        long sendText;
        long startTranscribing;
        long stopTranscribing;
        long startMeeting;
        long deleteMeeting;
        long lockMeeting;
        long unlockMeeting;
        long muteAll2;
        long unmuteAll2;
        long muteParticipant2;
        switch (this.f3328a) {
            case 0:
                ReentrantReadWriteLock.ReadLock readLock = ((m) this.f3329b).f3331a.f3372i.readLock();
                Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                    } finally {
                        readLock.unlock();
                        ((m) this.f3329b).getClass();
                    }
                } catch (SQLiteException e10) {
                    Log.e("ROOM", StubApp.getString2("2907"), e10);
                    emptySet = SetsKt.emptySet();
                } catch (IllegalStateException e11) {
                    Log.e(StubApp.getString2("53"), StubApp.getString2("2907"), e11);
                    emptySet = SetsKt.emptySet();
                }
                if (((m) this.f3329b).a() && ((m) this.f3329b).f3335e.compareAndSet(true, false) && !((m) this.f3329b).f3331a.g().s().v()) {
                    P1.c s10 = ((m) this.f3329b).f3331a.g().s();
                    s10.d();
                    try {
                        emptySet = a();
                        s10.G();
                        if (emptySet.isEmpty()) {
                            return;
                        }
                        m mVar = (m) this.f3329b;
                        synchronized (mVar.f3339i) {
                            try {
                                Iterator it = mVar.f3339i.iterator();
                                while (true) {
                                    C1476b c1476b = (C1476b) it;
                                    if (c1476b.hasNext()) {
                                        ((k) ((Map.Entry) c1476b.next()).getValue()).a(emptySet);
                                    } else {
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    } finally {
                        s10.h();
                    }
                }
                return;
            case 1:
                Conversation conversation = ((L9.a) this.f3329b).f4321c;
                startConversation = conversation.startConversation(conversation.f12661a);
                Contracts.throwIfFail(startConversation);
                return;
            case 2:
                Conversation conversation2 = ((L9.a) this.f3329b).f4321c;
                deleteConversation = conversation2.deleteConversation(conversation2.f12661a);
                Contracts.throwIfFail(deleteConversation);
                return;
            case 3:
                Conversation conversation3 = ((L9.a) this.f3329b).f4321c;
                lockConversation = conversation3.lockConversation(conversation3.f12661a);
                Contracts.throwIfFail(lockConversation);
                return;
            case 4:
                Conversation conversation4 = ((L9.a) this.f3329b).f4321c;
                unlockConversation = conversation4.unlockConversation(conversation4.f12661a);
                Contracts.throwIfFail(unlockConversation);
                return;
            case 5:
                Conversation conversation5 = ((L9.a) this.f3329b).f4321c;
                muteAll = conversation5.muteAll(conversation5.f12661a);
                Contracts.throwIfFail(muteAll);
                return;
            case 6:
                Conversation conversation6 = ((L9.a) this.f3329b).f4321c;
                unmuteAll = conversation6.unmuteAll(conversation6.f12661a);
                Contracts.throwIfFail(unmuteAll);
                return;
            case 7:
                L9.b bVar = (L9.b) this.f3329b;
                Conversation conversation7 = bVar.f4325d;
                muteParticipant = conversation7.muteParticipant(conversation7.f12661a, bVar.f4323b);
                Contracts.throwIfFail(muteParticipant);
                return;
            case 8:
                L9.b bVar2 = (L9.b) this.f3329b;
                Conversation conversation8 = bVar2.f4325d;
                unmuteParticipant = conversation8.unmuteParticipant(conversation8.f12661a, bVar2.f4323b);
                Contracts.throwIfFail(unmuteParticipant);
                return;
            case 9:
                L9.e eVar = (L9.e) this.f3329b;
                Conversation conversation9 = eVar.f4334d;
                addParticipant = conversation9.addParticipant(conversation9.f12661a, eVar.f4332b.getImpl());
                Contracts.throwIfFail(addParticipant);
                return;
            case 10:
                L9.f fVar = (L9.f) this.f3329b;
                Conversation conversation10 = fVar.f4338d;
                addParticipantByUser = conversation10.addParticipantByUser(conversation10.f12661a, fVar.f4336b.getImpl());
                Contracts.throwIfFail(addParticipantByUser);
                return;
            case 11:
                L9.f fVar2 = (L9.f) this.f3329b;
                Conversation conversation11 = fVar2.f4338d;
                removeParticipantByUser = conversation11.removeParticipantByUser(conversation11.f12661a, fVar2.f4336b.getImpl());
                Contracts.throwIfFail(removeParticipantByUser);
                return;
            case 12:
                L9.e eVar2 = (L9.e) this.f3329b;
                Conversation conversation12 = eVar2.f4334d;
                removeParticipant = conversation12.removeParticipant(conversation12.f12661a, eVar2.f4332b.getImpl());
                Contracts.throwIfFail(removeParticipant);
                return;
            case 13:
                L9.b bVar3 = (L9.b) this.f3329b;
                Conversation conversation13 = bVar3.f4325d;
                removeParticipantByUserId = conversation13.removeParticipantByUserId(conversation13.f12661a, bVar3.f4323b);
                Contracts.throwIfFail(removeParticipantByUserId);
                return;
            case 14:
                Conversation conversation14 = ((L9.a) this.f3329b).f4321c;
                endConversation = conversation14.endConversation(conversation14.f12661a);
                Contracts.throwIfFail(endConversation);
                return;
            case 15:
                L9.h hVar = (L9.h) this.f3329b;
                ConversationTranscriber conversationTranscriber = hVar.f4343b;
                SafeHandle impl = hVar.f4344c.getImpl();
                Set set = ConversationTranscriber.f12669b;
                conversationTranscriber.startContinuousRecognition(impl);
                return;
            case 16:
                L9.h hVar2 = (L9.h) this.f3329b;
                ConversationTranscriber conversationTranscriber2 = hVar2.f4343b;
                SafeHandle impl2 = hVar2.f4344c.getImpl();
                Set set2 = ConversationTranscriber.f12669b;
                conversationTranscriber2.stopContinuousRecognition(impl2);
                return;
            case 17:
                CallableC1207q0 callableC1207q0 = (CallableC1207q0) this.f3329b;
                joinConversation = ((ConversationTranslator) callableC1207q0.f16589c).joinConversation(((ConversationTranslator) callableC1207q0.f16591e).f12685a, ((Conversation) callableC1207q0.f16590d).getImpl(), callableC1207q0.f16588b);
                Contracts.throwIfFail(joinConversation);
                return;
            case 18:
                L9.j jVar = (L9.j) this.f3329b;
                joinConversationId = jVar.f4348a.joinConversationId(jVar.f4352e.f12685a, jVar.f4349b, jVar.f4350c, jVar.f4351d);
                Contracts.throwIfFail(joinConversationId);
                return;
            case 19:
                L9.k kVar = (L9.k) this.f3329b;
                leaveConversation = kVar.f4354b.leaveConversation(kVar.f4355c.f12685a);
                Contracts.throwIfFail(leaveConversation);
                return;
            case 20:
                K9.b bVar4 = (K9.b) this.f3329b;
                sendText = ((ConversationTranslator) bVar4.f3764b).sendText(((ConversationTranslator) bVar4.f3766d).f12685a, (String) bVar4.f3765c);
                Contracts.throwIfFail(sendText);
                return;
            case 21:
                L9.k kVar2 = (L9.k) this.f3329b;
                startTranscribing = kVar2.f4354b.startTranscribing(kVar2.f4355c.f12685a);
                Contracts.throwIfFail(startTranscribing);
                return;
            case 22:
                L9.k kVar3 = (L9.k) this.f3329b;
                stopTranscribing = kVar3.f4354b.stopTranscribing(kVar3.f4355c.f12685a);
                Contracts.throwIfFail(stopTranscribing);
                return;
            case 23:
                Meeting meeting = ((L9.l) this.f3329b).f4358c;
                startMeeting = meeting.startMeeting(meeting.f12690a);
                Contracts.throwIfFail(startMeeting);
                return;
            case 24:
                Meeting meeting2 = ((L9.l) this.f3329b).f4358c;
                deleteMeeting = meeting2.deleteMeeting(meeting2.f12690a);
                Contracts.throwIfFail(deleteMeeting);
                return;
            case 25:
                Meeting meeting3 = ((L9.l) this.f3329b).f4358c;
                lockMeeting = meeting3.lockMeeting(meeting3.f12690a);
                Contracts.throwIfFail(lockMeeting);
                return;
            case 26:
                Meeting meeting4 = ((L9.l) this.f3329b).f4358c;
                unlockMeeting = meeting4.unlockMeeting(meeting4.f12690a);
                Contracts.throwIfFail(unlockMeeting);
                return;
            case 27:
                Meeting meeting5 = ((L9.l) this.f3329b).f4358c;
                muteAll2 = meeting5.muteAll(meeting5.f12690a);
                Contracts.throwIfFail(muteAll2);
                return;
            case 28:
                Meeting meeting6 = ((L9.l) this.f3329b).f4358c;
                unmuteAll2 = meeting6.unmuteAll(meeting6.f12690a);
                Contracts.throwIfFail(unmuteAll2);
                return;
            default:
                L9.m mVar2 = (L9.m) this.f3329b;
                Meeting meeting7 = mVar2.f4362d;
                muteParticipant2 = meeting7.muteParticipant(meeting7.f12690a, mVar2.f4360b);
                Contracts.throwIfFail(muteParticipant2);
                return;
        }
    }
}
