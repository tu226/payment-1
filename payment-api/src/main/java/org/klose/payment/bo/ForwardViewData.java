package org.klose.payment.bo;


import org.klose.payment.constant.FrontPageForwardType;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ForwardViewData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9116023289802069799L;

	private Long transactionId;

	private FrontPageForwardType forwardType;

	private String forwardURL;

	private String returnURL;
	
	private String endPoint;

	private Map<String, String> params;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public FrontPageForwardType getForwardType() {
		return forwardType;
	}

	public void setForwardType(FrontPageForwardType forwardType) {
		this.forwardType = forwardType;
	}

	public String getForwardURL() {
		return forwardURL;
	}

	public void setForwardURL(String forwardURL) {
		this.forwardURL = forwardURL;
	}

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public void addParam(String key, String value) {
		if (this.params == null) {
			this.params = new HashMap<String, String>();
		}

		this.params.put(key, value);
	}

	@Override
	public String toString() {
		return "ForwardViewData [transactionId=" + transactionId
				+ ", forwardType=" + forwardType + ", forwardURL=" + forwardURL
				+ ", returnURL=" + returnURL + ", endPoint=" + endPoint + ", params=" + params + "]";
	}

}
