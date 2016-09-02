/**
 * 
 */
package org.pradeep.service.messenger.resource;

import javax.ws.rs.QueryParam;

/**
 * @author pradeep
 *
 */
public class MessageFilterBean {
	@QueryParam("year")
	private int year;
	@QueryParam("start")
	private int start;
	@QueryParam("size")
	private int size;

	/**
	 * @return the year
	 */
	public final int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public final void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the start
	 */
	public final int getStart() {
		return start;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public final void setStart(int start) {
		this.start = start;
	}

	/**
	 * @return the size
	 */
	public final int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public final void setSize(int size) {
		this.size = size;
	}
}
