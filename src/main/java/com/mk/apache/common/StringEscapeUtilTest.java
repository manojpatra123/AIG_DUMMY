/**
 * 
 */
package com.mk.apache.common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class StringEscapeUtilTest {



    public static void main(String[] args) {
	      //Join all Strings in the Array into a Single String, separated by $#$ 
    	
    	int splitIndex = 1500;
//    	String str ="<p>Limited consumer benefits[edit]In United States, economists and consumer advocates generally consider insurance to be worthwhile for low-probability, catastrophic losses, but not for high-probability, small losses. Because of this, consumers are advised to select high deductibles and to not insure losses which would not cause a disruption in their life. However, consumers have shown a tendency to prefer low deductibles and to prefer to insure relatively high-probability, small losses over low-probability, perhaps due to not understanding or ignoring the low-probability risk. This is associated with reduced purchasing of insurance against low-probability losses, and may result in increased inefficiencies from moral hazard.[48]Redlining[edit]Redlining is the practice of denying insurance coverage in specific geographic areas, supposedly because of a high likelihood of loss, while the alleged motivation is unlawful discrimination. Racial profiling or redlining has a long history in the property insurance industry in the United States. From a review of industry underwriting and marketing materials, court documents, and research by government agencies, industry and community groups, and academics, it is clear that race has long affected and continues to affect the policies and practices of the insurance industry.[49]In July 2007, The Federal Trade Commission (FTC) released a report presenting the results of a study concerning credit-based insurance scores in automobile insurance. The study found that these scores are effective predictors of risk. It also showed that African-Americans and Hispanics are substantially overrepresented in the lowest credit scores, and substantially underrepresented in the highest, while Caucasians and Asians are more evenly spread across the scores. The credit scores were also found to predict risk within each of the ethnic groups, leading the FTC to conclude that the scoring models are not solely proxies for redlining. The FTC indicated little data was available to evaluate benefit of insurance scores to consumers.[50] The report was disputed by representatives of the Consumer Federation of America, the National Fair Housing Alliance, the National Consumer Law Center, and the Center for Economic Justice, for relying on data provided by the insurance industry.[51]All states have provisions in their rate regulation laws or in their fair trade practice acts that prohibit unfair discrimination, often called redlining, in setting rates and making insurance available.[52]In determining premiums and premium rate structures, insurers consider quantifiable factors, including location, credit scores, gender, occupation, marital status, andeducation level. However, the use of such factors is often considered to be unfair or unlawfully discriminatory, and the reaction against this practice has in some instances led to political disputes about the ways in which insurers determine premiums and regulatory intervention to limit the factors used.An insurance underwriter's job is to evaluate a given risk as to the likelihood that a loss will occur. Any factor that causes a greater likelihood of loss should theoretically be charged a higher rate. This basic principle of insurance must be followed if insurance companies are to remain solvent.[citation needed] Thus, &quot;discrimination&quot; against (i.e., negative differential treatment of) potential insureds in the risk evaluation and premium-setting process is a necessary by-product of the fundamentals of insurance underwriting. For instance, insurers charge older people significantly higher premiums than they charge younger people for term life insurance. Older people are thus treated differently from younger people (i.e., a distinction is made, discrimination occurs). The rationale for the differential treatment goes to the heart of the risk a life insurer takes: Old people are likely to die sooner than young people, so the risk of loss (the insured's death) is greater in any given period of time and therefore the risk premium must be higher to cover the greater risk. However, treating insureds differently when there is no actuarially sound reason for doing so is unlawful discrimination.Insurance patents[edit]Further information: Insurance patentNew assurance products can now be protected from copying with a business method patent in the United States.A recent example of a new insurance product that is patented is Usage Based auto insurance. Early versions were independently invented and patented by a major US auto insurance company, Progressive Auto Insurance (U.S. Patent 5,797,134) and a Spanish independent inventor, Salvador Minguijon Perez (EP 0700009).Many independent inventors are in favor of patenting new insurance products since it gives them protection from big companies when they bring their new insurance products to market. Independent inventors account for 70% of the new U.S. patent applications in this area.Many insurance executives are opposed to patenting insurance products because it creates a new risk for them. The Hartford insurance company, for example, recently had to pay $80 million to an independent inventor, Bancorp Services, in order to settle a patent infringement and theft of trade secret lawsuit for a type of corporate owned life insurance product invented and patented by Bancorp.There are currently about 150 new patent applications on insurance inventions filed per year in the United States. The rate at which patents have been issued has steadily risen from 15 in 2002 to 44 in 2006.[53]Inventors can now have their insurance US patent applications reviewed by the public in the Peer to Patent program.[54] The first insurance patent application to be posted was US2009005522 &quot;risk assessment company&quot;. It was posted on March 6, 2009. This patent application describes a method for increasing the ease of changing insurance companies.[55]The insurance industry and rent-seeking[edit]Certain insurance products and practices have been described as rent-seeking by critics.[citation needed] That is, some insurance products or practices are useful primarily because of legal benefits, such as reducing taxes, as opposed to providing protection against risks of adverse events. Under United States tax law, for example, most owners of variable annuities and variable life insurance can invest their premium payments in the stock market and defer or eliminate paying any taxes on their investments until withdrawals are made. Sometimes this tax deferral is the only reason people use these products.[citation needed] Another example is the legal infrastructure which allows life insurance to be held in an irrevocable trust which is used to pay an estate tax while the proceeds themselves are immune from the estate tax.Religious concerns[edit]Muslim scholars have varying opinions about life insurance. Life insurance policies that earn interest (or guaranteed bonus/NAV) are generally considered to be a form of riba[56] (usury) and some consider even policies that do not earn interest to be a form of gharar (speculation). Some argue that gharar is not present due to the actuarial science behind the underwriting.[57]Jewish rabbinical scholars also have expressed reservations regarding insurance as an avoidance of God's will but most find it acceptable in moderation.[58]Some Christians believe insurance represents a lack of faith[citation needed] and there is a long history of resistance to commercial insurance in Anabaptistcommunities (Mennonites, Amish, Hutterites, Brethren in Christ) but many participate in community-based self-insurance programs that spread risk within their communities.[59][60][61]Legal[edit]When a company insures an individual entity, there are basic legal requirements. Several commonly cited legal principles of insurance include:[19]1. Indemnity - the insurance company indemnifies, or compensates, the insured in the case of certain losses only up to the insured's interest.2. Benefit insurance - as it is stated in the study books of The Chartered Insurance Institute, the insurance company doesn't have the right of recovery from the party who caused the injury and is to compensate the Insured regardless of the fact that Insured had already sued the negligent party for the damages (for example, personal accident insurance)3. Insurable interest - the insured typically must directly suffer from the loss. Insurable interest must exist whether property insurance or insurance on a person is involved. The concept requires that the insured have a &quot;stake&quot; in the loss or damage to the life or property insured. What that &quot;stake&quot; is will be determined by the kind of insurance involved and the nature of the property ownership or relationship between the persons. The requirement of an insurable interest is what distinguishes insurance from gambling.4. Utmost good faith - (Uberrima fides) the insured and the insurer are bound by a good faith bond of honesty and fairness. Material facts must be disclosed.5. Contribution - insurers which have similar obligations to the insured contribute in the indemnification, according to some method.6. Subrogation - the insurance company acquires legal rights to pursue recoveries on behalf of the insured; for example, the insurer may sue those liable for the insured's loss. The Insurers can waive their subrogation rights by using the special clauses.7. Causa proxima, or proximate cause - the cause of loss (the peril) must be covered under the insuring agreement of the policy, and the dominant cause must not be excluded8. Mitigation - In case of any loss or casualty, the asset owner must attempt to keep loss to a minimum, as if the asset was not insured.Indemnification[edit]Main article: IndemnityTo &quot;indemnify&quot; means to make whole again, or to be reinstated to the position that one was in, to the extent possible, prior to the happening of a specified event or peril. Accordingly, life insurance is generally not considered to be indemnity insurance, but rather &quot;contingent&quot; insurance (i.e., a claim arises on the occurrence of a specified event). There are generally three types of insurance contracts that seek to indemnify an insured:1. A &quot;reimbursement&quot; policy2. A &quot;pay on behalf&quot; or &quot;on behalf of&quot; policy[20]3. An &quot;indemnification&quot; policyFrom an insured's standpoint, the result is usually the same: the insurer pays the loss and claims expenses.If the Insured has a &quot;reimbursement&quot; policy, the insured can be required to pay for a loss and then be &quot;reimbursed&quot; by the insurance carrier for the loss and out of pocket costs including, with the permission of the insurer, claim expenses.[20][21]Under a &quot;pay on";
    	String str = "324232safdsad34";
 //   	String[] strList = new String[10];
    	List<String> strList =  new ArrayList<>();
    	int index =0, pos = 0;
    	//int pos=0;
/*    	while( j <str.length()){
    		strList[i] = StringUtils.substring(str,j, j+splitIndex);
    		i = i+1;
    		j = j+ splitIndex;
    	}
*/    	while( pos <str.length()){
			strList.add(index,StringUtils.substring(str,pos, pos+splitIndex));
    		index = index+1;
    		pos = pos+ splitIndex;
    	}

	      System.out.println("7) Join Strings using separator >>>" +
	          StringUtils.join(strList, "<i></i>"));
	    }

}
class MyClass {
    private String name = null;
    private int age = 0;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this,
            ToStringStyle.DEFAULT_STYLE);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
