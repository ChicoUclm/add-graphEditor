
/*
 * 
 */
package add.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class AddPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createParameters2Group());
		paletteRoot.add(createSenses3Group());
		paletteRoot.add(createNotes4Group());
		paletteRoot.add(createLinks5Group());
	}

	/**
	* Creates "Nodes" palette tool group
	* @generated
	*/
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createAwareness1CreationTool());
		paletteContainer.add(createEvent2CreationTool());
		paletteContainer.add(createAction3CreationTool());
		paletteContainer.add(createData4CreationTool());
		paletteContainer.add(createWidget5CreationTool());
		paletteContainer.add(createController6CreationTool());
		paletteContainer.add(createDevice7CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Parameters" palette tool group
	* @generated
	*/
	private PaletteContainer createParameters2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Parameters2Group_title);
		paletteContainer.setId("createParameters2Group"); //$NON-NLS-1$
		paletteContainer.add(createAwarenessarea1CreationTool());
		paletteContainer.add(createAwarenessdimension2CreationTool());
		paletteContainer.add(createInformationelement3CreationTool());
		paletteContainer.add(createInteraction4CreationTool());
		paletteContainer.add(createOperation5CreationTool());
		paletteContainer.add(createTemporality6CreationTool());
		paletteContainer.add(createEventandparameters7CreationTool());
		paletteContainer.add(createDataparameter8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Senses" palette tool group
	* @generated
	*/
	private PaletteContainer createSenses3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Senses3Group_title);
		paletteContainer.setId("createSenses3Group"); //$NON-NLS-1$
		paletteContainer.add(createHear1CreationTool());
		paletteContainer.add(createSight2CreationTool());
		paletteContainer.add(createSmell3CreationTool());
		paletteContainer.add(createTaste4CreationTool());
		paletteContainer.add(createTouch5CreationTool());
		paletteContainer.add(createEnvironment6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Notes" palette tool group
	* @generated
	*/
	private PaletteContainer createNotes4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Notes4Group_title);
		paletteContainer.setId("createNotes4Group"); //$NON-NLS-1$
		paletteContainer.add(createRequirementsdescription1CreationTool());
		paletteContainer.add(createLogicdescription2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Links" palette tool group
	* @generated
	*/
	private PaletteContainer createLinks5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Links5Group_title);
		paletteContainer.setId("createLinks5Group"); //$NON-NLS-1$
		paletteContainer.add(createDescribedby1CreationTool());
		paletteContainer.add(createCharacterizedby2CreationTool());
		paletteContainer.add(createWidgetFlow3CreationTool());
		paletteContainer.add(createDataFlow4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAwareness1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Awareness1CreationTool_title,
				Messages.Awareness1CreationTool_desc, Collections.singletonList(AddElementTypes.Awareness_2010));
		entry.setId("createAwareness1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/009-cardiogram.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEvent2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Event2CreationTool_title,
				Messages.Event2CreationTool_desc, Collections.singletonList(AddElementTypes.Input_2007));
		entry.setId("createEvent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/005-upload.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Action3CreationTool_title,
				Messages.Action3CreationTool_desc, Collections.singletonList(AddElementTypes.Output_2008));
		entry.setId("createAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/004-download.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createData4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Data4CreationTool_title,
				Messages.Data4CreationTool_desc, Collections.singletonList(AddElementTypes.Data_2009));
		entry.setId("createData4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/023-data.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWidget5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Widget5CreationTool_title,
				Messages.Widget5CreationTool_desc, Collections.singletonList(AddElementTypes.Widget_2011));
		entry.setId("createWidget5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/015-radar.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createController6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Controller6CreationTool_title,
				Messages.Controller6CreationTool_desc, Collections.singletonList(AddElementTypes.Controller_2013));
		entry.setId("createController6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/013-cogwheel.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDevice7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Device7CreationTool_title,
				Messages.Device7CreationTool_desc, Collections.singletonList(AddElementTypes.Device_2012));
		entry.setId("createDevice7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AddDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.add.figuras/images/014-game-controller.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAwarenessarea1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Awarenessarea1CreationTool_title,
				Messages.Awarenessarea1CreationTool_desc, Collections.singletonList(AddElementTypes.Area_3007));
		entry.setId("createAwarenessarea1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/003-menu-1.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAwarenessdimension2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Awarenessdimension2CreationTool_title,
				Messages.Awarenessdimension2CreationTool_desc,
				Collections.singletonList(AddElementTypes.Dimension_3008));
		entry.setId("createAwarenessdimension2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/001-menu.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInformationelement3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Informationelement3CreationTool_title,
				Messages.Informationelement3CreationTool_desc, Collections.singletonList(AddElementTypes.Element_3009));
		entry.setId("createInformationelement3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/002-button.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInteraction4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Interaction4CreationTool_title,
				Messages.Interaction4CreationTool_desc, Collections.singletonList(AddElementTypes.Interaction_3001));
		entry.setId("createInteraction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/011-mouse.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperation5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Operation5CreationTool_title,
				Messages.Operation5CreationTool_desc, Collections.singletonList(AddElementTypes.Operation_3005));
		entry.setId("createOperation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AddDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.add.figuras/images/006-sports-and-competition.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTemporality6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AddElementTypes.Time_3002);
		types.add(AddElementTypes.Time_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Temporality6CreationTool_title,
				Messages.Temporality6CreationTool_desc, types);
		entry.setId("createTemporality6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/010-alarm.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEventandparameters7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Eventandparameters7CreationTool_title,
				Messages.Eventandparameters7CreationTool_desc, Collections.singletonList(AddElementTypes.Event_3003));
		entry.setId("createEventandparameters7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/016-drag.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataparameter8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Dataparameter8CreationTool_title,
				Messages.Dataparameter8CreationTool_desc, Collections.singletonList(AddElementTypes.Datax_3006));
		entry.setId("createDataparameter8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/024-bit.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHear1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Hear1CreationTool_title,
				Messages.Hear1CreationTool_desc, Collections.singletonList(AddElementTypes.Hear_2004));
		entry.setId("createHear1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/019-ear.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSight2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Sight2CreationTool_title,
				Messages.Sight2CreationTool_desc, Collections.singletonList(AddElementTypes.Sight_2001));
		entry.setId("createSight2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/008-eye.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSmell3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Smell3CreationTool_title,
				Messages.Smell3CreationTool_desc, Collections.singletonList(AddElementTypes.Smell_2005));
		entry.setId("createSmell3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/020-nose.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTaste4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Taste4CreationTool_title,
				Messages.Taste4CreationTool_desc, Collections.singletonList(AddElementTypes.Taste_2003));
		entry.setId("createTaste4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/018-tongue.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTouch5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Touch5CreationTool_title,
				Messages.Touch5CreationTool_desc, Collections.singletonList(AddElementTypes.Touch_2002));
		entry.setId("createTouch5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/017-hold.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnvironment6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Environment6CreationTool_title,
				Messages.Environment6CreationTool_desc, Collections.singletonList(AddElementTypes.Environment_2006));
		entry.setId("createEnvironment6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/022-sensor.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRequirementsdescription1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Requirementsdescription1CreationTool_title,
				Messages.Requirementsdescription1CreationTool_desc,
				Collections.singletonList(AddElementTypes.Share_2014));
		entry.setId("createRequirementsdescription1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/021-share.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLogicdescription2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Logicdescription2CreationTool_title,
				Messages.Logicdescription2CreationTool_desc, Collections.singletonList(AddElementTypes.Flow_2015));
		entry.setId("createLogicdescription2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/007-flow.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDescribedby1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Describedby1CreationTool_title,
				Messages.Describedby1CreationTool_desc, Collections.singletonList(AddElementTypes.DashLink_4004));
		entry.setId("createDescribedby1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/028-dash-link.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCharacterizedby2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Characterizedby2CreationTool_title,
				Messages.Characterizedby2CreationTool_desc, Collections.singletonList(AddElementTypes.NormalLink_4001));
		entry.setId("createCharacterizedby2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/027-link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWidgetFlow3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.WidgetFlow3CreationTool_title,
				Messages.WidgetFlow3CreationTool_desc, Collections.singletonList(AddElementTypes.SolidLink_4002));
		entry.setId("createWidgetFlow3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				AddDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.add.figuras/images/025-solid-link.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataFlow4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DataFlow4CreationTool_title,
				Messages.DataFlow4CreationTool_desc, Collections.singletonList(AddElementTypes.SolidGreyLink_4003));
		entry.setId("createDataFlow4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AddDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.add.figuras/images/026-solid-link-grey.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
