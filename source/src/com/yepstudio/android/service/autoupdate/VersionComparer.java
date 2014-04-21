package com.yepstudio.android.service.autoupdate;

import android.content.Context;

/**
 * 版本比较器
 * @author zhangzl@gmail.com
 * @create 2014年4月18日
 * @version 1.0, 2014年4月18日
 *
 */
public interface VersionComparer {
	
	/**
	 * 比较版本是否有新版本
	 * @param module
	 * @param context
	 * @param version
	 * @param isAutoUpdate
	 * @return true是新版本，false不是
	 */
	public boolean compare(String module, Context context, Version version);
}
