package qin.model;

import java.io.Serializable;
import java.util.ArrayList;

import qin.model.msgContainer.*;


public class QinMessagePacket implements Serializable {
	private static final long serialVersionUID = 1L;

	private String command;
	private String responseMsg = null;
	
	private RegisterContainer registerContainer = null;
	private LoginContainer loginContainer = null;
	private LogoutContainer logoutContainer = null;
	private MessageContainer msgContainer = null;
	private MessageListContainer msgListContainer = null;
	
	private OnlineInfoContainer onlineinfoContainer = null;
	private ArrayList<OnlineInfoContainer> onlineinfoContainerList = null;
	
	private FindUserContainer findUserContainer = null;
	
	private HeartBeatContainer heartBeatContainer = null;
	private AddFriendContainer addFriendContainer = null;
	private DeleteFriendContainer deleteFriendContainer = null;
	//private MakeFriendContainer makeFriendContainer = null;
	
	private FindQunContainer findQunContainer = null;
	private CreateQunContainer createQunContainer = null;
	
	private JoinQunContainer joinQunContainer = null;
	private ExitQunContainer exitQunContainer = null;
	
	//private ChangeGroupInfoContainer  changeGroupInfoContainer = null;
	//private ChangeUserInfoContainer	changeUserInfoContainer  = null;
	
	//private ChatContainer chatContainer = null;
	
	
	
	public QinMessagePacket(String _command) {
		command = _command;
	}
	
	
	/***
	 * �� �������� command �йص� set��get����
	 * @return
	 */
	public String getCommand() {
		return command;
	}
	public void setCommand(String _command) {
		command = _command;
	}
	
	public String getResponseMsg(){
		return responseMsg;
	}
	
	public void setResponseMsg(String msg){
		responseMsg = msg;
	}

	/***
	 * �� ע�� �йص�set��get����
	 * @return
	 */
	public RegisterContainer getRegisterContainer() {
		return registerContainer;
	}
	
	public void setRegisterContainer(RegisterContainer _registerContainer) {
		registerContainer = _registerContainer;
	}
	
	
	/***
	 * �� ��¼ �йص�set��get����
	 * @return
	 */
	public LoginContainer getLoginContainer() {
		return loginContainer;
	}
	public void setLoginContainer(LoginContainer _loginContainer) {
		loginContainer = _loginContainer;
	}
	
	public LogoutContainer getLogoutContainer(){
		return logoutContainer;
	}
	
	public void setLogoutContainer(LogoutContainer logout){
		logoutContainer = logout;
	}
	
	public MessageContainer getMessageContainer(){
		return msgContainer;
	}
	
	public void setMessageContainer(MessageContainer msgc){
		msgContainer = msgc;
	}
	
	public MessageListContainer getMessageListContainer(){
		return msgListContainer;
	}
	
	public void setMessageListContainer(MessageListContainer msgListc){
		msgListContainer = msgListc;
	}
	
	public OnlineInfoContainer getOnlineInfoContainer(){
		return onlineinfoContainer;
	}
	
	public void setOnlineInfoContainer(OnlineInfoContainer online){
		onlineinfoContainer = online;
	}
	
	public ArrayList<OnlineInfoContainer> getOnlineinfoContainerList(){
		return onlineinfoContainerList;
	}
	
	public void setOnlineinfoContainerList(ArrayList<OnlineInfoContainer> list){
		onlineinfoContainerList = list;
	}
	
	public FindUserContainer getFindUserContainer(){
		return findUserContainer;
	}
	
	public void setFindUserContainer(FindUserContainer fc){
		findUserContainer = fc;
	}
	
	public void setHeartBeatContainer(HeartBeatContainer hbc) {
		heartBeatContainer = hbc;
	}
	
	public HeartBeatContainer getHeartBeatContainer() {
		return heartBeatContainer;
	}
	
	public void setAddFriendContainer(AddFriendContainer afc) {
		addFriendContainer = afc;
	}
	
	public AddFriendContainer getAddFriendContainer() {
		return addFriendContainer;
	}
	
	public void setDeleteFriendContainer(DeleteFriendContainer dfc) {
		deleteFriendContainer = dfc;
	}
	
	public DeleteFriendContainer getDeleteFriendContainer() {
		return deleteFriendContainer;
	}
	
	public void setFindQunContainer(FindQunContainer fqc) {
		findQunContainer = fqc;
	}
	
	public FindQunContainer getFindQunContainer() {
		return findQunContainer;
	}
	
	public void setCreateQunContainer(CreateQunContainer cqc) {
		createQunContainer = cqc;
	}
	
	public CreateQunContainer getCreateQunContainer() {
		return createQunContainer;
	}
	
	public void setJoinQunContainer(JoinQunContainer jqc) {
		joinQunContainer = jqc;
	}
	
	public JoinQunContainer getJoinQunContainer() {
		return joinQunContainer;
	}
	
	public void setExitQunContainer(ExitQunContainer eqc) {
		exitQunContainer = eqc;
	}
	
	public ExitQunContainer getExitQunContainer() {
		return exitQunContainer;
	}
	
	/***
	 * �� ע�� �йص�set��get����
	 * @return
	 *//*
	public LogoutContainer getLogoutContainer() {
		return logoutSeqment;
	}
	public void setLogoutContainer(LogoutContainer _logoutContainer) {
		logoutSeqment = _logoutContainer;
	}
*/
	
	/***
	 * �� ��ѯ�û���Ϣ �йص�set��get����
	 * @return
	 *//*
	public FindUserContainer getFindUserContainer() {
		return findUserContainer;
	}
	public void setFindUserContainer(FindUserContainer _findUserContainer) {
		findUserContainer = _findUserContainer;
	}
	*/
	
	/***
	 * �� ��Ӻ��� �йص�set��get����
	 * @return
	 *//*
	public MakeFriendContainer getMakeFriendContainer() {
		return  makeFriendContainer;
	}
	public void setMakeFriendContainer(MakeFriendContainer _makeFriendContainer) {
		makeFriendContainer = _makeFriendContainer;
	}
	*/
	
	/***
	 * �� ����Ⱥ �йص�set��get����
	 * @return
	 *//*
	public CreateGroupContainer getCreateGroupContainer() {
		return createGroupContainer;
	}
	public void setCreateGroupContainer(CreateGroupContainer _createGroupContainer) {
		createGroupContainer = _createGroupContainer;
	}
	*/
	
	/***
	 * �� ��ѯȺ �йص�set��get����
	 * @return
	 *//*
	public FindGroupContainer getFindGroupContainer() {
		return findGroupContainer;
	}
	public void setFindGroupContainer(FindGroupContainer _findGroupContainer) {
		findGroupContainer = _findGroupContainer;
	}
	*/
	
	/***
	 * �� ����Ⱥ �йص�set��get����
	 * @return
	 *//*
	public JoinInGroupContainer  getJoinInGroupContainer() {
		return joinInGroupContainer;
	}
	public void setJoinInGroupContainer(JoinInGroupContainer _joinInGroupContainer) {
		joinInGroupContainer = _joinInGroupContainer;
	}
	*/
	
	/***
	 * �� ���Ⱥ���� �йص�set��get����
	 * @return
	 *//*
	public ChangeGroupInfoContainer getChangeGroupInfoContainer() {
		return changeGroupInfoContainer;
	}
	public void setChangeGroupInfoContainer(ChangeGroupInfoContainer _changeGroupInfoContainer) {
		changeGroupInfoContainer = _changeGroupInfoContainer;
	}
	*/
	
	/***
	 * �� ����û���Ϣ �йص�set��get����
	 * @return
	 *//*
	public ChangeUserInfoContainer getChangeUserInfoContainer() {
		return changeUserInfoContainer;
	}
	public void setChangeUserInfoContainer(ChangeUserInfoContainer _changeUserInfoContainer) {
		changeUserInfoContainer = _changeUserInfoContainer ;
	}
	*/
	/***
	 * �� ���� �йص�set��get����
	 * @return
	 *//*
	public ChatContainer getChatContainer() {
		return chatContainer;
	}
	public void setChatContainer(ChatContainer _chatContainer) {
		chatContainer = _chatContainer;
	}
	*/
}

