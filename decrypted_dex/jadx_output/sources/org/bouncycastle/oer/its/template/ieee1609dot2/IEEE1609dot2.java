package org.bouncycastle.oer.its.template.ieee1609dot2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.ElementSupplier;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.Switch;
import org.bouncycastle.oer.SwitchIndexer;
import org.bouncycastle.oer.its.template.etsi103097.extension.EtsiTs103097ExtensionModule;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IEEE1609dot2 {
    public static final OERDefinition.Builder AesCcmCiphertext;
    public static final OERDefinition.Builder Certificate;
    public static final OERDefinition.Builder CertificateBase;
    public static final OERDefinition.Builder CertificateId;
    public static final OERDefinition.Builder CertificateType;
    public static final OERDefinition.Builder ContributedExtensionBlock;
    public static final Switch ContributedExtensionBlockSwitch;
    public static final OERDefinition.Builder ContributedExtensionBlocks;
    public static final OERDefinition.Builder CounterSignature;
    public static final OERDefinition.Builder EncryptedData;
    public static final OERDefinition.Builder EncryptedDataEncryptionKey;
    public static final OERDefinition.Builder EndEntityType;
    public static final OERDefinition.Builder ExplicitCertificate;
    public static final OERDefinition.Builder HashedData;
    public static final OERDefinition.Builder HeaderInfo;
    public static final OERDefinition.Builder HeaderInfoContributorId;
    public static final OERDefinition.Builder Ieee1609Dot2Content;
    public static final OERDefinition.Builder Ieee1609Dot2Data;
    public static final OERDefinition.Builder ImplicitCertificate;
    public static final OERDefinition.Builder IssuerIdentifier;
    public static final OERDefinition.Builder LinkageData;
    public static final OERDefinition.Builder MissingCrlIdentifier;
    public static final OERDefinition.Builder Opaque;
    public static final OERDefinition.Builder PKRecipientInfo;
    public static final OERDefinition.Builder PduFunctionalType;
    public static final OERDefinition.Builder PreSharedKeyRecipientInfo;
    public static final OERDefinition.Builder PsidGroupPermissions;
    public static final OERDefinition.Builder RecipientInfo;
    public static final OERDefinition.Builder SequenceOfCertificate;
    public static final OERDefinition.Builder SequenceOfPsidGroupPermissions;
    public static final OERDefinition.Builder SequenceOfRecipientInfo;
    public static final OERDefinition.Builder SignedData;
    public static final OERDefinition.Builder SignedDataPayload;
    public static final OERDefinition.Builder SignerIdentifier;
    public static final OERDefinition.Builder SubjectPermissions;
    public static final OERDefinition.Builder SymmRecipientInfo;
    public static final OERDefinition.Builder SymmetricCiphertext;
    public static final OERDefinition.Builder ToBeSignedCertificate;
    public static final OERDefinition.Builder ToBeSignedData;
    public static final OERDefinition.Builder VerificationKeyIndicator;
    private static final ASN1Integer etsiHeaderInfoContributorId;
    private static ASN1Integer explicitOrdinal;
    private static final ASN1Encodable[] extensionBlockSwitchKeys;
    private static ASN1Integer implicitOrdinal;

    static {
        OERDefinition.Builder typeName = OERDefinition.octets().typeName(StubApp.getString2(33399));
        Opaque = typeName;
        OERDefinition.Builder typeName2 = OERDefinition.integer(0L, 255L).typeName(StubApp.getString2(33400));
        PduFunctionalType = typeName2;
        OERDefinition.Builder typeName3 = OERDefinition.choice(OERDefinition.octets(32).label(StubApp.getString2(33401)), OERDefinition.extension(OERDefinition.octets(48).label(StubApp.getString2(33402)), OERDefinition.octets(32).label(StubApp.getString2(33403)))).typeName(StubApp.getString2(33404));
        HashedData = typeName3;
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.HashedId3;
        String string2 = StubApp.getString2(33405);
        OERDefinition.Builder label = builder.label(string2);
        OERDefinition.Builder builder2 = Ieee1609Dot2BaseTypes.CrlSeries;
        String string22 = StubApp.getString2(33406);
        OERDefinition.Builder typeName4 = OERDefinition.seq(label, builder2.label(string22), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33407));
        MissingCrlIdentifier = typeName4;
        ASN1Integer aSN1Integer = new ASN1Integer(BigIntegers.TWO);
        etsiHeaderInfoContributorId = aSN1Integer;
        extensionBlockSwitchKeys = new ASN1Encodable[]{aSN1Integer};
        OERDefinition.Builder validSwitchValue = OERDefinition.integer(0L, 255L).typeName(StubApp.getString2(33408)).validSwitchValue(aSN1Integer);
        HeaderInfoContributorId = validSwitchValue;
        Switch r42 = new Switch() { // from class: org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2.1
            @Override // org.bouncycastle.oer.Switch
            public ASN1Encodable[] keys() {
                return IEEE1609dot2.extensionBlockSwitchKeys;
            }

            @Override // org.bouncycastle.oer.Switch
            public Element result(SwitchIndexer switchIndexer) {
                ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(switchIndexer.get(0).toASN1Primitive());
                if (aSN1Integer2.equals((ASN1Primitive) IEEE1609dot2.etsiHeaderInfoContributorId)) {
                    return OERDefinition.seqof(EtsiTs103097ExtensionModule.EtsiOriginatingHeaderInfoExtension).rangeToMAXFrom(1L).label(StubApp.getString2(33395)).build();
                }
                throw new IllegalArgumentException(StubApp.getString2(33396) + aSN1Integer2);
            }
        };
        ContributedExtensionBlockSwitch = r42;
        OERDefinition.Builder typeName5 = OERDefinition.seq(validSwitchValue.label(StubApp.getString2(33409)), OERDefinition.aSwitch(r42).label(StubApp.getString2(33410))).typeName(StubApp.getString2(33411));
        ContributedExtensionBlock = typeName5;
        OERDefinition.Builder typeName6 = OERDefinition.seqof(typeName5).rangeToMAXFrom(1L).typeName(StubApp.getString2(33412));
        ContributedExtensionBlocks = typeName6;
        OERDefinition.Builder builder3 = Ieee1609Dot2BaseTypes.HashedId8;
        OERDefinition.Builder typeName7 = builder3.typeName(StubApp.getString2(33413));
        PreSharedKeyRecipientInfo = typeName7;
        OERDefinition.Builder builder4 = Ieee1609Dot2BaseTypes.EciesP256EncryptedKey;
        OERDefinition.Builder typeName8 = OERDefinition.choice(builder4.label(StubApp.getString2(33414)), builder4.label(StubApp.getString2(33415)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33416));
        EncryptedDataEncryptionKey = typeName8;
        String string23 = StubApp.getString2(33417);
        OERDefinition.Builder label2 = builder3.label(string23);
        String string24 = StubApp.getString2(33418);
        OERDefinition.Builder typeName9 = OERDefinition.seq(label2, typeName8.label(string24)).typeName(StubApp.getString2(33419));
        PKRecipientInfo = typeName9;
        OERDefinition.Builder typeName10 = OERDefinition.seq(OERDefinition.octets(12).label(StubApp.getString2(29510)), typeName.label(StubApp.getString2(33420))).typeName(StubApp.getString2(33421));
        AesCcmCiphertext = typeName10;
        OERDefinition.Builder typeName11 = OERDefinition.choice(typeName10.label(StubApp.getString2(33422)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33423));
        SymmetricCiphertext = typeName11;
        OERDefinition.Builder typeName12 = OERDefinition.seq(builder3.label(string23), typeName11.label(string24)).typeName(StubApp.getString2(33424));
        SymmRecipientInfo = typeName12;
        OERDefinition.Builder typeName13 = OERDefinition.choice(typeName7.label(StubApp.getString2(33425)), typeName12.label(StubApp.getString2(33426)), typeName9.label(StubApp.getString2(33427)), typeName9.label(StubApp.getString2(33428)), typeName9.label(StubApp.getString2(33429))).typeName(StubApp.getString2(33430));
        RecipientInfo = typeName13;
        OERDefinition.Builder typeName14 = OERDefinition.seqof(typeName13).typeName(StubApp.getString2(33431));
        SequenceOfRecipientInfo = typeName14;
        OERDefinition.Builder typeName15 = OERDefinition.seq(typeName14.label(StubApp.getString2(33432)), typeName11.label(StubApp.getString2(33433))).typeName(StubApp.getString2(33434));
        EncryptedData = typeName15;
        OERDefinition.Builder typeName16 = OERDefinition.bitString(8L).defaultValue(new DERBitString(new byte[]{0}, 0)).typeName(StubApp.getString2(33435));
        EndEntityType = typeName16;
        OERDefinition.Builder builder5 = Ieee1609Dot2BaseTypes.SequenceOfPsidSspRange;
        String string25 = StubApp.getString2(33436);
        OERDefinition.Builder typeName17 = OERDefinition.choice(builder5.label(string25), OERDefinition.nullValue().label(StubApp.getString2(23002)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33437));
        SubjectPermissions = typeName17;
        OERDefinition.Builder typeName18 = OERDefinition.choice(Ieee1609Dot2BaseTypes.PublicVerificationKey.label(StubApp.getString2(33373)), Ieee1609Dot2BaseTypes.EccP256CurvePoint.label(StubApp.getString2(33438)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33439));
        VerificationKeyIndicator = typeName18;
        OERDefinition.Builder typeName19 = OERDefinition.seq(typeName17.label(StubApp.getString2(33440)), OERDefinition.integer(1L).label(StubApp.getString2(33441)), OERDefinition.integer(0L).label(StubApp.getString2(33442)), typeName16.label(StubApp.getString2(33443))).typeName(StubApp.getString2(33444));
        PsidGroupPermissions = typeName19;
        OERDefinition.Builder typeName20 = OERDefinition.seqof(typeName19).typeName(StubApp.getString2(33445));
        SequenceOfPsidGroupPermissions = typeName20;
        OERDefinition.Builder typeName21 = OERDefinition.seq(Ieee1609Dot2BaseTypes.IValue.label(StubApp.getString2(33446)), Ieee1609Dot2BaseTypes.LinkageValue.label(StubApp.getString2(33447)), OERDefinition.optional(Ieee1609Dot2BaseTypes.GroupLinkageValue.label(StubApp.getString2(33448))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33449));
        LinkageData = typeName21;
        OERDefinition.Builder typeName22 = OERDefinition.choice(typeName21.label(StubApp.getString2(33450)), Ieee1609Dot2BaseTypes.Hostname.label(StubApp.getString2(ModuleDescriptor.MODULE_VERSION)), OERDefinition.octets(1, 64).label(StubApp.getString2(33451)), OERDefinition.nullValue().label(StubApp.getString2(1337)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33452));
        CertificateId = typeName22;
        OERDefinition.Builder label3 = typeName22.label(StubApp.getString2(290));
        OERDefinition.Builder label4 = builder.label(string2);
        OERDefinition.Builder label5 = builder2.label(string22);
        OERDefinition.Builder label6 = Ieee1609Dot2BaseTypes.ValidityPeriod.label(StubApp.getString2(33366));
        OERDefinition.Builder label7 = Ieee1609Dot2BaseTypes.GeographicRegion.label(StubApp.getString2(2051));
        OERDefinition.Builder label8 = Ieee1609Dot2BaseTypes.SubjectAssurance.label(StubApp.getString2(33367));
        OERDefinition.Builder label9 = Ieee1609Dot2BaseTypes.SequenceOfPsidSsp.label(StubApp.getString2(33368));
        OERDefinition.Builder label10 = typeName20.label(StubApp.getString2(33369));
        OERDefinition.Builder label11 = typeName20.label(StubApp.getString2(33453));
        OERDefinition.Builder label12 = OERDefinition.nullValue().label(StubApp.getString2(33454));
        OERDefinition.Builder builder6 = Ieee1609Dot2BaseTypes.PublicEncryptionKey;
        String string26 = StubApp.getString2(33374);
        OERDefinition.Builder typeName23 = OERDefinition.seq(label3, label4, label5, label6, OERDefinition.optional(label7, label8, label9, label10, label11, label12, builder6.label(string26)), typeName18.label(StubApp.getString2(33455)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33456));
        ToBeSignedCertificate = typeName23;
        OERDefinition.Builder label13 = builder3.label(StubApp.getString2(33457));
        OERDefinition.Builder builder7 = Ieee1609Dot2BaseTypes.HashAlgorithm;
        String string27 = StubApp.getString2(33458);
        OERDefinition.Builder typeName24 = OERDefinition.choice(label13, builder7.label(string27), OERDefinition.extension(builder3.label(StubApp.getString2(33459)))).typeName(StubApp.getString2(33460));
        IssuerIdentifier = typeName24;
        OERDefinition.Builder typeName25 = OERDefinition.enumeration(OERDefinition.enumItem(string25), OERDefinition.enumItem(StubApp.getString2(33461)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33462));
        CertificateType = typeName25;
        explicitOrdinal = new ASN1Integer(BigInteger.ZERO);
        implicitOrdinal = new ASN1Integer(BigInteger.ONE);
        OERDefinition.Builder builder8 = Ieee1609Dot2BaseTypes.UINT8;
        OERDefinition.Builder label14 = builder8.label(StubApp.getString2(2155));
        String string28 = StubApp.getString2(660);
        OERDefinition.Builder label15 = typeName25.label(string28);
        OERDefinition.Builder label16 = typeName24.label(StubApp.getString2(33463));
        OERDefinition.Builder label17 = typeName23.label(StubApp.getString2(33464));
        OERDefinition.Builder builder9 = Ieee1609Dot2BaseTypes.Signature;
        String string29 = StubApp.getString2(33465);
        OERDefinition.Builder typeName26 = OERDefinition.seq(label14, label15, label16, label17, OERDefinition.optional(builder9.label(string29))).label(string29).typeName(StubApp.getString2(33466));
        CertificateBase = typeName26;
        OERDefinition.Builder typeName27 = typeName26.copy().typeName(StubApp.getString2(33467));
        Certificate = typeName27;
        ExplicitCertificate = typeName26.typeName(StubApp.getString2(33468)).replaceChild(1, typeName25.validSwitchValue(explicitOrdinal).label(string28));
        ImplicitCertificate = typeName26.typeName(StubApp.getString2(33469)).replaceChild(1, typeName25.validSwitchValue(implicitOrdinal).label(string28));
        OERDefinition.Builder typeName28 = OERDefinition.seqof(typeName27).typeName(StubApp.getString2(33470));
        SequenceOfCertificate = typeName28;
        OERDefinition.Builder typeName29 = OERDefinition.choice(builder3.label(StubApp.getString2(13292)), typeName28.label(StubApp.getString2(33329)), OERDefinition.nullValue().label(string27), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33471));
        SignerIdentifier = typeName29;
        OERDefinition.Builder label18 = Ieee1609Dot2BaseTypes.Psid.label(StubApp.getString2(33472));
        OERDefinition.Builder builder10 = Ieee1609Dot2BaseTypes.Time64;
        OERDefinition.Builder typeName30 = OERDefinition.seq(label18, OERDefinition.optional(builder10.label(StubApp.getString2(33473)), builder10.label(StubApp.getString2(33360)), Ieee1609Dot2BaseTypes.ThreeDLocation.label(StubApp.getString2(33474)), builder.label(StubApp.getString2(33475)), typeName4.label(StubApp.getString2(33476)), Ieee1609Dot2BaseTypes.EncryptionKey.label(string26)), OERDefinition.extension(OERDefinition.optional(Ieee1609Dot2BaseTypes.SequenceOfHashedId3.label(StubApp.getString2(33477)), typeName27.label(StubApp.getString2(33478)), typeName2.label(StubApp.getString2(33479)), typeName6.label(StubApp.getString2(33480))))).typeName(StubApp.getString2(33481));
        HeaderInfo = typeName30;
        SignedData = OERDefinition.seq(builder7.label(StubApp.getString2(33482)), OERDefinition.deferred(new ElementSupplier() { // from class: org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2.2
            private Element built;

            @Override // org.bouncycastle.oer.ElementSupplier
            public Element build() {
                Element element;
                synchronized (this) {
                    try {
                        if (this.built == null) {
                            this.built = IEEE1609dot2.ToBeSignedData.label(StubApp.getString2("33397")).build();
                        }
                        element = this.built;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return element;
            }
        }).label(StubApp.getString2(33397)), typeName29.label(StubApp.getString2(33483)), builder9.label(string29)).typeName(StubApp.getString2(33484));
        OERDefinition.Builder typeName31 = OERDefinition.choice(typeName.label(StubApp.getString2(33485)), OERDefinition.deferred(new ElementSupplier() { // from class: org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2.3
            private Element built;

            @Override // org.bouncycastle.oer.ElementSupplier
            public Element build() {
                Element element;
                synchronized (this) {
                    try {
                        if (this.built == null) {
                            this.built = IEEE1609dot2.SignedData.label(StubApp.getString2("33398")).mayRecurse(true).build();
                        }
                        element = this.built;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return element;
            }
        }).label(StubApp.getString2(33398)).mayRecurse(true), typeName15.label(StubApp.getString2(33486)), typeName.label(StubApp.getString2(33487)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33488));
        Ieee1609Dot2Content = typeName31;
        String string210 = StubApp.getString2(33489);
        OERDefinition.Builder label19 = builder8.label(string210);
        String string211 = StubApp.getString2(1248);
        CounterSignature = OERDefinition.seq(label19, typeName31.label(string211)).typeName(StubApp.getString2(33490));
        OERDefinition.Builder typeName32 = OERDefinition.seq(builder8.validSwitchValue(new ASN1Integer(3L)).label(string210), typeName31.label(string211)).typeName(StubApp.getString2(33491));
        Ieee1609Dot2Data = typeName32;
        OERDefinition.Builder typeName33 = OERDefinition.seq(OERDefinition.optional(typeName32.label(StubApp.getString2(1485)), typeName3.label(StubApp.getString2(33492))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33493));
        SignedDataPayload = typeName33;
        ToBeSignedData = OERDefinition.seq(typeName33.label(StubApp.getString2(1055)), typeName30.label(StubApp.getString2(33494))).typeName(StubApp.getString2(33495));
    }
}
