/*
 * Copyright (c) 2011, Jan Amoyo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 *
 * - Redistributions of source code must retain the above copyright 
 *   notice, this list of conditions and the following disclaimer.
 * 
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer 
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS 
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED 
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, 
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF 
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH 
 * DAMAGE.
 * 
 * LogonSessionMISessionStateListener.java
 * 6 Jun 2011
 */
package com.jramoyo.qfixmessenger.ui.listeners;

import javax.swing.JCheckBoxMenuItem;

import quickfix.SessionStateListener;

/**
 * @author jamoyo
 */
public class LogonSessionMenuItemSessionStateListener implements
		SessionStateListener
{
	private JCheckBoxMenuItem menuItem;

	public LogonSessionMenuItemSessionStateListener(JCheckBoxMenuItem menuItem)
	{
		this.menuItem = menuItem;
	}

	@Override
	public void onConnect()
	{
	}

	@Override
	public void onDisconnect()
	{
	}

	@Override
	public void onHeartBeatTimeout()
	{
	}

	@Override
	public void onLogon()
	{
		menuItem.setSelected(true);
	}

	@Override
	public void onLogout()
	{
		menuItem.setSelected(false);
	}

	@Override
	public void onMissedHeartBeat()
	{
	}

	@Override
	public void onRefresh()
	{
	}

	@Override
	public void onReset()
	{
	}

}
