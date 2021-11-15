import ImgDsDark from 'assets/img/ds-dark.svg';
import { Link } from 'react-router-dom';

function NavBar() {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <Link to="/">
                    <img src={ImgDsDark} alt="SemanaSpring" width="120" />
                </Link>
            </div>
        </div>
    );
}

export default NavBar;