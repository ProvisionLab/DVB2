package com.nabusdev.padmedvbts2.util;
import com.nabusdev.padmedvbts2.Main;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;

import static com.nabusdev.padmedvbts2.util.Variable.get;

public class Constants {
    public static final String IDENTIFICATION = get("ident");
    public static final String DB_USER = get("dbUser");
    public static final String DB_PASSWORD = get("dbPassword");
    public static final String DB_HOST = get("dbHost");
    public static final String DB_PORT = get("dbPort");
    public static final String DB_TYPE = get("dbType");
    public static final String DB_NAME = get("dbName");
    public static final String JAVA_EXEC_PATH = getJavaExecutablePath();

    public class Telnet {
        public static final int PORT = 12345;
        public static final String LAST_CONFIGURATION_READ = "lastConfigurationRead"; // for 'CONFIG STATUS' telnet com

        public class Commands {
            public static final String CHANNEL_INPUT_START = "CHANNEL INPUT START";
            public static final String CHANNEL_INPUT_STOP = "CHANNEL INPUT STOP";
            public static final String CHANNEL_INPUT_RESTART = "CHANNEL INPUT RESTART";
            public static final String CHANNEL_OUTPUT_START = "CHANNEL OUTPUT START";
            public static final String CHANNEL_OUTPUT_STOP = "CHANNEL OUTPUT STOP";
            public static final String CHANNEL_OUTPUT_RESTART = "CHANNEL OUTPUT RESTART";
            public static final String CHANNEL_RENEW = "CHANNEL RENEW";
            public static final String CHANNEL_STATUS = "CHANNEL STATUS";
            public static final String CHANNEL_ALLSTATUS = "CHANNEL ALLSTATUS";
            public static final String CONFIG_RENEW = "CONFIG RENEW";
            public static final String CONFIG_STATUS = "CONFIG STATUS";
            public static final String DBCONN_RENEW = "DBCONN RENEW";
            public static final String DBCONN_STATUS = "DBCONN STATUS";
        }
    }

    public class Table {

        public class ServerSetup {
            public static final String TABLE_NAME = "dvbts2.server_setup";
            public static final String IDENT = "ident";
            public static final String SETUP_KEY = "setup_key";
            public static final String SETUP_VALUE = "setup_value";

            public static final String COMMAND_MANAGER_INTERFACE = "commandManagerInterface";
            public static final String COMMAND_MANAGER_HOST = "commandManagerHost";
            public static final String COMMAND_MANAGER_PORT = "commandManagerPort";
            public static final String COMMAND_MANAGER_ALLOW_FROM = "commandManagerAllowFrom";
            public static final String DB_MANAGER_HOST = "dbManagerHost";
            public static final String DB_MANAGER_PORT = "dbManagerPort";
            public static final String DB_MANAGER_USERNAME = "dbManagerUsername";
            public static final String DB_MANAGER_PASSWORD = "dbManagerPassword";
            public static final String DB_MANAGER_DATABASE = "dbManagerDatabase";
            public static final String DB_MANAGER_PERIOD = "dbManagerPeriod";
            public static final String DB_MANAGER_TIMEOUT = "dbManagerTimeout";
        }

        public class Channels {
            public static final String TABLE_NAME = "dvbts2.channels";
            public static final String ID = "id";
            public static final String ADAPTER_ID = "adapter_id";
            public static final String NAME = "name";
            public static final String IDENT = "ident";
            public static final String PNR = "pnr";
            public static final String THUMB_SAVE_PATH = "thumb_save_path";
            public static final String THUMB_SAVE_FILENAME_PATTERN = "thumb_save_filename_pattern";
            public static final String THUMB_SAVE_PERIOD = "thumb_save_period";
            public static final String THUMB_SAVE_FORMAT = "thumb_save_format";
            public static final String DATE_START = "date_start";
            public static final String DATE_STOP = "date_stop";
            public static final String DATE_FAILED = "date_failed";
            public static final String FAILED_MESSAGE = "failed_message";
            public static final String ACTIVE = "active";
        }

        public class Adapters {
            public static final String TABLE_NAME = "dvbts2.adapters";
            public static final String ID = "id";
            public static final String IDENT = "ident";
            public static final String PATH = "path";
            public static final String ADAPTER_TYPE = "adapter_type";
            public static final String FREQUENCY = "frequency";
            public static final String BANDWIDTH = "bandwidth";
            public static final String TRANSMISSION_MODE = "transmission_mode";
            public static final String GUARD_INTERVAL = "guard_interval";
            public static final String HIERARCHY = "hierarchy";
            public static final String MODULATION = "modulation";
            public static final String DATE_START = "date_start";
            public static final String DATE_STOP = "date_stop";
            public static final String DATE_FAILED = "date_failed";
            public static final String FAILED_MESSAGE = "failed_message";
            public static final String ACTIVE = "active";
        }

        public class StreamForward {
            public static final String TABLE_NAME = "dvbts2.stream_forward";
            public static final String ID = "id";
            public static final String CHANNEL_ID = "channel_id";
            public static final String EVENT_TYPE = "event_type";
            public static final String OUTPUT_STREAM_PROTOCOL = "output_stream_protocol";
            public static final String OUTPUT_STREAM_HOST = "output_stream_host";
            public static final String OUTPUT_STREAM_PORT = "output_stream_port";
            public static final String OUTPUT_STREAM_USERNAME = "output_stream_username";
            public static final String OUTPUT_STREAM_PASSWORD = "output_stream_password";
            public static final String OUTPUT_STREAM_URL_PATH = "output_stream_url_path";
            public static final String OUTPUT_STREAM_TIMEOUT = "output_stream_client_limit";
            public static final String OUTPUT_STREAM_CLIENT_LIMIT = "date_streaming_start";
            public static final String DATA_STREAMING_START = "date_streaming_start";
            public static final String DATA_STREAMING_STOP = "date_streaming_stop";
            public static final String DATA_STREAMING_FAILED = "date_streaming_failed";
            public static final String STREAMING_FAILED_MESSAGE = "streaming_failed_message";
            public static final String CONNECTION_ATTEMPTS = "connection_attempts";
            public static final String ACTIVE = "active";
        }

        public class ChannelThumbs {
            public static final String TABLE_NAME = "dvbts2.channel_thumbs";
            public static final String CHANNEL_ID = "channel_id";
            public static final String PATH = "path";
            public static final String FILENAME = "filename";
            public static final String SIZE = "size";
            public static final String FORMAT = "format";
            public static final String ACTIVE = "active";
            public static final String DATE_CREATED = "date_created";
        }

        public class EpgProgrammes {
            public static final String TABLE_NAME = "dvbts2.epg_programmes";
            public static final String ID = "id";
            public static final String CHANNEL_ID = "channel_id";
            public static final String DATE_START = "date_start";
            public static final String DATE_STOP = "date_stop";
            public static final String DATE_MAKE = "date_make";
            public static final String TITLE = "title";
            public static final String TITLE_LANG = "title_lang";
            public static final String SUBTITLE = "subtitle";
            public static final String SUBTITLE_LANG = "subtitle_lang";
            public static final String DESCRIPTION = "description";
            public static final String DESCRIPTION_LANG = "description_lang";
            public static final String LANG = "lang";
            public static final String VIDEO_ASPECT = "video_aspect";
            public static final String AUDIO = "audio";
            public static final String RATING_SYSTEM = "rating_system";
            public static final String RATING_VALUE = "rating_value";
            public static final String SUBTITLES_TYPE = "subtitles_type";
            public static final String SUBTITLES_LANG = "subtitles_lang";
            public static final String ACTIVE = "active";
        }
    }

    public class Xml {

        public class EpgResult {
            public static final String XML_PATH = "epg.xml";
            public static final String PROGRAMME = "programme";
            public static final String CHANNEL = "channel";
            public static final String START = "start";
            public static final String STOP = "stop";
            public static final String TITLE = "title";
            public static final String TITLE_LANG = "lang";
            public static final String SUBTITLE = "sub-title";
            public static final String SUBTITLE_LANG = "lang";
            public static final String DESC = "desc";
            public static final String DESC_LANG = "lang";
            public static final String LANGUAGE = "language";
            public static final String VIDEO = "video";
            public static final String VIDEO_ASPECT = "aspect";
            public static final String AUDIO = "audio";
            public static final String AUDIO_STEREO = "stereo";
            public static final String RATING = "rating";
            public static final String RATING_SYSTEM = "dvb";
            public static final String RATING_VALUE = "value";
            public static final String SUBTITLES = "subtitles";
            public static final String SUBTITLES_TYPE = "type";
            public static final String SUBTITLES_LANGUAGE = "language";
        }
    }

    private static String getJavaExecutablePath() {
        try {
            CodeSource codeSource = Main.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();
            return jarDir;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return "";
    }
}
