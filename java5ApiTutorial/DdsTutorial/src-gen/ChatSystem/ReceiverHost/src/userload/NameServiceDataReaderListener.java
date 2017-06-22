package userload;

import java.util.ArrayList;
import java.util.List;

import org.omg.dds.core.GuardCondition;
import org.omg.dds.core.event.DataAvailableEvent;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.DataReaderAdapter;
import org.omg.dds.sub.InstanceState;
import org.omg.dds.sub.Sample;
import org.omg.dds.sub.SampleState;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.sub.Subscriber.DataState;
import org.omg.dds.sub.ViewState;

import ChatModule.NameService;

//Start of user code User required imports
//End of user code

public class NameServiceDataReaderListener extends DataReaderAdapter<NameService> {
	//Start of user code User defined attributes
	private GuardCondition readerGuardCondition;
	private Subscriber readerSubscriber;
	private DataReader<NameService> NameServiceDataReader;
	//End of user code

	public void onDataAvailable(DataAvailableEvent<NameService> status) {
		//Start of user code Method body
		List<Sample<NameService>> samples = new ArrayList<>();
		DataState ds = readerSubscriber.createDataState();
		ds = ds.with(SampleState.NOT_READ).with(ViewState.NEW).with(InstanceState.ALIVE);
		this.NameServiceDataReader.select().dataState(ds).take(samples);
		for (Sample<NameService> sample : samples ) {
			if (sample.getData().id == -1) {
				System.out.println("User load exits");
				this.readerGuardCondition.setTriggerValue(true);
			} else {
				System.out.println("User " + sample.getData().Name + " joins the chat");
			}
		}
		//End of user code
	}

	//Start of user code User defined methods
	public void setReaderGuardCondition(GuardCondition readerGuardCondition) {
		this.readerGuardCondition = readerGuardCondition;
	}
	
	public void setReaderSubscriber(Subscriber readerSubscriber) {
		this.readerSubscriber = readerSubscriber;
	}
	
	public void setNameServiceDataReader(DataReader<NameService> NameServiceDataReader) {
		this.NameServiceDataReader = NameServiceDataReader;
	}
	//End of user code
} 
