/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2015, Telestax Inc and individual contributors
 * by the @authors tag. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.media.server.impl.rtp.channels;

import org.mobicents.media.server.impl.rtp.sdp.AVProfile;
import org.mobicents.media.server.io.network.UdpManager;
import org.mobicents.media.server.scheduler.Scheduler;
import org.mobicents.media.server.spi.dsp.DspFactory;

/**
 * @author Henrique Rosa (henrique.rosa@telestax.com)
 *
 */
public class VideoSession extends RtpSession {

    public VideoSession(int channelId, Scheduler scheduler, DspFactory dspFactory, UdpManager udpManager) {
        super(channelId, AVProfile.VIDEO, scheduler, dspFactory, udpManager);
        super.supportedFormats = AVProfile.video;
        super.setFormats(this.supportedFormats);
    }

}
