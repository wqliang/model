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
	
	private FindQunContainer findQunContainer = null;
	private CreateQunContainer createQunContainer = null;
	
	private JoinQunContainer joinQunContainer = null;
	private ExitQunContainer exitQunContainer = null;
	
	private ModifyUserInfoContainer modifyUserInfoContainer = null;
	private ModifyQunInfoContainer modifyQunInfoContainer = null;	
	
	private SendFileSegment sendFileSegment = null;

	private ReceiveAddFriendApplicationContainer receiveAddFriendApplicationContainer = null;
	private RespondAddFriendApplicationContainer respondAddFriendApplicationContainer = null;
	
	private ReceiveJoinQunApplicationContainer receiveJoinQunApplicationContainer = null;
	private RespondJoinQunApplicationContainer respondJoinQunApplicationContainer = null;
	
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
	
	public ModifyUserInfoContainer getModifyUserInfoContainer() {
		return modifyUserInfoContainer;
	}
	
	public void setModifyUserInfoContainer(ModifyUserInfoContainer muic) {
		modifyUserInfoContainer = muic;
	}
	
	public ModifyQunInfoContainer getModifyQunInfoContainer() {
		return modifyQunInfoContainer;
	}
	
	public void setModifyQunInfoContainer(ModifyQunInfoContainer mqic) {
		modifyQunInfoContainer = mqic;
	}
	
	public SendFileSegment getSendFileSegment() {
		return sendFileSegment;
	}
	
	public void setSendFileSegment(SendFileSegment _sendFileSegment) {
		sendFileSegment =  _sendFileSegment;
	}
	
	public void setReceiveAddFriendApplicationContainer(ReceiveAddFriendApplicationContainer rafac) {
		receiveAddFriendApplicationContainer = rafac;
	}
	
	public ReceiveAddFriendApplicationContainer getReceiveAddFriendApplicationContainer() {
		return receiveAddFriendApplicationContainer;
	}
	
	public void setRespondAddFriendApplicationContainer(RespondAddFriendApplicationContainer rafac) {
		respondAddFriendApplicationContainer = rafac;
	}
	
	public RespondAddFriendApplicationContainer getRespondAddFriendApplicationContainer() {
		return respondAddFriendApplicationContainer;
	}
	
	public void setReceiveJoinQunApplicationContainer(ReceiveJoinQunApplicationContainer rjqac) {
		receiveJoinQunApplicationContainer = rjqac;
	}
	
	public ReceiveJoinQunApplicationContainer getReceiveJoinQunApplicationContainer() {
		return receiveJoinQunApplicationContainer;
	}
	
	public void setRespondJoinQunApplicationContainer(RespondJoinQunApplicationContainer rjqac) {
		respondJoinQunApplicationContainer = rjqac;
	}
	
	public RespondJoinQunApplicationContainer getRespondJoinQunApplicationContainer() {
		return respondJoinQunApplicationContainer;
	}
}

