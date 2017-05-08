package DdsGenerator;

import java.util.LinkedList;
import java.util.List;

import ddsMetamodel.DdsDataModule;
import ddsMetamodel.DdsDataStructure;

public class DdsModel2Code {
	public List<DdsDataModule> getModulesHierarchy(DdsDataStructure aStructure) {
		LinkedList<DdsDataModule> hierarchy = new LinkedList<>();
		DdsDataModule module = aStructure.getContainerDataModule();
		do {
			hierarchy.addFirst(module);
			module = module.getContainingModule();
		} while (module != null);
		return hierarchy;
	}
}
