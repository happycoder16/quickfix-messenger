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
 * FixDictionaryParser.java
 * 7 Jun 2011
 */
package com.jramoyo.fix.model.parser;

import java.io.InputStream;

import com.jramoyo.fix.model.FixDictionary;

/**
 * Interface for FIX Dictionary parsers
 * 
 * @author jamoyo
 */
public interface FixDictionaryParser
{
	/**
	 * Parses a QuickFIX dictionary XML file
	 * 
	 * @param fileName
	 *            the name of the dictionary file
	 * @return a FixDictionary representation of the dictionary
	 * @throws FixParsingException
	 */
	@Deprecated
	FixDictionary parse(String fileName) throws FixParsingException;

	/**
	 * Parses a QuickFIX dictionary XML file
	 * 
	 * @param inputStream
	 *            the dictionary file as <code>InputStream</code>
	 * @return a FixDictionary representation of the dictionary
	 * @throws FixParsingException
	 */
	FixDictionary parse(InputStream inputStream) throws FixParsingException;
}
