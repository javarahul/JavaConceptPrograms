package javaprograms.designpattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channelList;

	public ChannelCollectionImpl() {
		channelList = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		channelList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		channelList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, channelList);
	}

	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelList) {
			this.type = type;
			channels = channelList;
		}

		@Override
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel c = channels.get(position);

				if (c.getType().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}
	}
}
