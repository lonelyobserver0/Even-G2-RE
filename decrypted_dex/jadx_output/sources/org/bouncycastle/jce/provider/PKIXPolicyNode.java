package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXPolicyNode implements PolicyNode {
    protected List children;
    protected boolean critical;
    protected int depth;
    protected Set expectedPolicies;
    protected PolicyNode parent;
    protected Set policyQualifiers;
    protected String validPolicy;

    public PKIXPolicyNode(List list, int i3, Set set, PolicyNode policyNode, Set set2, String str, boolean z2) {
        this.children = list;
        this.depth = i3;
        this.expectedPolicies = set;
        this.parent = policyNode;
        this.policyQualifiers = set2;
        this.validPolicy = str;
        this.critical = z2;
    }

    public void addChild(PKIXPolicyNode pKIXPolicyNode) {
        this.children.add(pKIXPolicyNode);
        pKIXPolicyNode.setParent(this);
    }

    public Object clone() {
        return copy();
    }

    public PKIXPolicyNode copy() {
        HashSet hashSet = new HashSet();
        Iterator it = this.expectedPolicies.iterator();
        while (it.hasNext()) {
            hashSet.add(new String((String) it.next()));
        }
        HashSet hashSet2 = new HashSet();
        Iterator it2 = this.policyQualifiers.iterator();
        while (it2.hasNext()) {
            hashSet2.add(new String((String) it2.next()));
        }
        PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), this.depth, hashSet, null, hashSet2, new String(this.validPolicy), this.critical);
        Iterator it3 = this.children.iterator();
        while (it3.hasNext()) {
            PKIXPolicyNode copy = ((PKIXPolicyNode) it3.next()).copy();
            copy.setParent(pKIXPolicyNode);
            pKIXPolicyNode.addChild(copy);
        }
        return pKIXPolicyNode;
    }

    @Override // java.security.cert.PolicyNode
    public Iterator getChildren() {
        return this.children.iterator();
    }

    @Override // java.security.cert.PolicyNode
    public int getDepth() {
        return this.depth;
    }

    @Override // java.security.cert.PolicyNode
    public Set getExpectedPolicies() {
        return this.expectedPolicies;
    }

    @Override // java.security.cert.PolicyNode
    public PolicyNode getParent() {
        return this.parent;
    }

    @Override // java.security.cert.PolicyNode
    public Set getPolicyQualifiers() {
        return this.policyQualifiers;
    }

    @Override // java.security.cert.PolicyNode
    public String getValidPolicy() {
        return this.validPolicy;
    }

    public boolean hasChildren() {
        return !this.children.isEmpty();
    }

    @Override // java.security.cert.PolicyNode
    public boolean isCritical() {
        return this.critical;
    }

    public void removeChild(PKIXPolicyNode pKIXPolicyNode) {
        this.children.remove(pKIXPolicyNode);
    }

    public void setCritical(boolean z2) {
        this.critical = z2;
    }

    public void setExpectedPolicies(Set set) {
        this.expectedPolicies = set;
    }

    public void setParent(PKIXPolicyNode pKIXPolicyNode) {
        this.parent = pKIXPolicyNode;
    }

    public String toString() {
        return toString("");
    }

    public String toString(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.validPolicy);
        stringBuffer.append(StubApp.getString2(20167));
        for (int i3 = 0; i3 < this.children.size(); i3++) {
            stringBuffer.append(((PKIXPolicyNode) this.children.get(i3)).toString(str + StubApp.getString2(6147)));
        }
        stringBuffer.append(str);
        stringBuffer.append(StubApp.getString2(20170));
        return stringBuffer.toString();
    }
}
